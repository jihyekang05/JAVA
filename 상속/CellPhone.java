package 상속;

//자바이전에 C++언어는 클래스에서 변수 선언하면서 초기화를 못함
//무조건 생성자를 안만들면 안된다. 그치만 안만들수도 있다.
//시스템이 제공하는 디폴트 생성자만으로도 충분한 경우가 많다

public class CellPhone {
	String model=""; //변수 선언시 초기화, 이러면 시스템이 제공하는 디폴트 생성자로도 충분하다.
	String color="";
	
	//생성자추가하기
	public CellPhone() {
		super(); //object의 부모생성자를 호출
		//CellPhone의 부모클래스 - Object클래스
		System.out.println("CellPhone 기본생성자 호출");
	}
	
	public CellPhone(String model, String color) {
		super();//object의 부모생성자를 호출
		this.model = model;
		this.color = color;
		System.out.println("CellPhone 매개변수 생성자 호출");
	}

	public void powerOn() {System.out.println("전원 on");}
	
	public void powerOff() {System.out.println("전원 off");}
	public void bell() {System.out.println("벨이 울립니다");}
	public void sendVoice(String msg) {System.out.println("자기" + msg);}
	public void receiveVoice(String msg) {
		System.out.println("상대방" + msg);}
	public void hangup(String msg) {
		System.out.println("전화끊음");}
}

