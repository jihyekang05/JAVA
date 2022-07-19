package 상속;

public class CellMain {
	/*
	public static void main(String[] args) {
		//DmbCellPhone 클래스에서 기본생성자를 안만들었음
		//사용자가 생성자를 만드는 순간 시스템은 만들던 기본 생성자를 안만들어준다
		//기본 생성방식으로 객체 생성이 불가능하다
		//기본 생성자를 만들거나 객체생성방법을 다르게한다
		//DmbCellPhone phone = new DmbCellPhone;
		DmbCellPhone phone = new DmbCellPhone("S2","red",4);
		phone.powerOn();
		phone.turnOnDmb();
		phone.bell();
		phone.receiveVoice("안녕");
		phone.sendVoice("여보세요");
		phone.hangup("dd");
		phone.turnOffDmb();
		phone.powerOff();
		
		//업캐스팅(자식타입이 부모타입으로 전환된다)
		CellPhone cp1 = phone;
		
		cp1.powerOff();
		cp1.powerOn();
		
		//다운캐스팅 (부모타입이 자식타입으로 전환된다.)
		//원칙적으로 허용할 수 없다. 그러나 원래 자식객체가 
		//잠깐 부모형태로 전환되었다가 원상복구 되는 경우에만 예외적으로 허용한다.
		phone = (DmbCellPhone)cp1;
		phone.powerOff();
		phone.powerOn();
		
		
		
	}*/
	
	public static void main(String[] args) {
		//객체 생성 연습
		DmbCellPhone p1 = new DmbCellPhone();
		DmbCellPhone p2 = new DmbCellPhone();
		p1.bell();
		p1.hangup(null);
		
		System.out.println(p1);
		
		//개체 비교시
		if(p1 == p2) //p1의 개체와 p2개체의 주소가 같으냐
		{
			System.out.println("둘이 같은 메모리다");
		}
		else
		{
			System.out.println("서로 다른 메모리다");
		}
		
		//클래스 만들어서 비교하고 싶으면 overriding 해야 한다
		if(p1.equals(p2))//내용이 같은지 비교
		{
			System.out.println("내용이 같다");
		}
		else
		{
			System.out.println("내용이 다르다");
		}
		
		PhoneSale ps = new PhoneSale();
		
		ps.selePhone(new CellPhone());
		ps.selePhone(new DmbCellPhone());
	}
}
