package 제네릭;

import java.util.ArrayList;
import java.util.List;

class Person
{
	String name="";
	int age = 0;
	
	public Person()
	{
		name="홍길동";
		age = 21;
	}
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
//주로 뭔가 담아두기 위한 클래스를 만들 때 제네릭(템플릿) 기법으로 만든다
class Box<T>{
	T buffer;
	public T get()
	{
		return buffer;
	}
	public void set(T buffer)
	{
		this.buffer = buffer;
	}
}

public class 제네릭 {
	
	public static void main(String[] args) {
		
		
		
		List<Person> perList = new ArrayList<Person>();
		perList.add(new Person());
		perList.add(new Person("임꺽정",23));
		//perList.add(new String("dddddd")); --컴파일 단계에서 에러난다.(과거버전에서 업데이트)
		
		for(int i=0; i<perList.size(); i++)
		{
			System.out.println(perList.get(i).name + " "+ perList.get(i).age);
		}
		
		Box<String> box = new Box<String>();
		box.set("Hello");
		System.out.println(box.get());
	}

}
