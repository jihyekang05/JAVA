package 컬렉션클래스응용;

import java.util.ArrayList;
import java.util.List;

//정렬을 지원하기 위해서는 Comparable이라는 인터페이스를 상속받는다.
class Person implements Comparable
{
	private String username;
	private String phone;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//자바는 모든 클래스가 Object 클래스를 상속받는다
	public Person() {
		super(); //부모클래스의 생성자를 호출한다
		// TODO Auto-generated constructor stub
	}
	public Person(String username, String phone, String email) {
		super();
		this.username = username;
		this.phone = phone;
		this.email = email;
	}
	
	//getter/setter
	//생성자
	//부모클래스에 있는 toString이라는 함수를 오버라이딩한다.
	//오버라이딩은 부모 클래스의 함수를 다시 만든다.
	@Override
	public String toString() {
		
		return username+" "+phone+" "+email;
	}
	//두개의 객체를 비교하고자 할때 호출되는 함수 - 오버라이딩
	//이름만 비교한다
	//indexOf 이 함수를 사용한다.
	@Override
	public boolean equals(Object obj) {
		Person o1 = (Person)obj;
		return username.equals(o1.username);
	}
	
	@Override
	public int compareTo(Object o) {
		Person o1 = (Person)o;
		return username.compareTo(o1.username);
	}
	

}

public class UseCollection {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		//ctrl=shift-o
		
		pList.add(new Person("김미정","000-1752-2144",""));
		pList.add(new Person("홍길동","010-0000-0000","test@hmail.net"));
		pList.add(new Person("임꺽정","010-0000-0001","test@hmail.net"));
		pList.add(new Person("이정민","010-0000-0002","test@hmail.net"));
		pList.add(new Person("박정민","010-0000-0003","test@hmail.net"));
		pList.add(new Person("김민수","010-0000-0004","test@hmail.net"));
		
		for(int i=0; i<pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		System.out.println("---데이터 끼워넣기---");
		pList.add(1, new Person("강윤서","010-5050-5645",""));
		for(int i=0; i<pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		System.out.println("-----삭제-----");
		pList.remove(0); //index로 삭제하는 경우
		//이름이 같은 경우에 삭제하고자 한다
		pList.remove(new Person("홍길동","",""));
		for(int i=0; i<pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		System.out.println("-----검색-----");
		System.out.println(pList.indexOf(new Person("박정민","","")));
		
		System.out.println("-----수정-----");
		pList.set(1, new Person("이정수","010-5484-5455",""));
		for(int i=0; i<pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		System.out.println("---이름으로 정렬하기------");
		pList.sort(null);
		for(int i=0; i<pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		Object obj1 = new Person("조승연","010-0000-9999","");
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
	}
}
