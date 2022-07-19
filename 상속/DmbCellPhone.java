package 상속;

//클래스중에 public 접근 권한을 갖는 클래스는 파일 하나에 하나만 적용가능하다.
//파일명과 클래스명이 동일해야 한다
public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
		//super();
		super("Note 5","cyan");
		this.channel=10;
		System.out.println("DmbCellPhone 기본생성자");
	}

	public void turnOnDmb()
	{
		System.out.println("채널"+ channel + "번 Dmb 반송 수신");
	}
	public void changeChannel(int channel)
	{
		this.channel = channel;
		System.out.println("채널 "+channel + "번으로 바꿉니다");
	}
	public void turnOffDmb()
	{
		System.out.println("Dmb방송수신을 멈춥니다");
	}

	@Override
	public void bell() {
		
		//super.bell();//부모클래스의함수를 호출한다.
		System.out.println("~파랗게 ");
		System.out.println("전화왔어~");
	}

	@Override
	public void hangup(String msg) {
		System.out.println("나중에 봐");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %d",model,color,channel);
		
	}

	@Override
	public boolean equals(Object obj) {
		//DmbCellPhone->object로 바뀌어서 업캐스팅되서 온다
		DmbCellPhone p = (DmbCellPhone)obj;
		return model.equals(p.model) && color.equals(p.color);
	}
	
	
	
	//생성자
	
}
