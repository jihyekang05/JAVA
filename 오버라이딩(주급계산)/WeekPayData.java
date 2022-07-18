
//한사람 분의 데이터만(주급계산에 필요한 데이터)
//정렬하고 싶으면 Comparable 인터페이스를 상속받거나
//comparator를 상속받아 별도의 클래스를 만들거나
public class WeekPayData implements Comparable{

	private String name ="";
	private int work_time=40;
	private int per_pay=10000;
	private int base_pay=0;
	private int over_pay=0;
	private int total_pay=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWork_time() {
		return work_time;
	}
	public void setWork_time(int work_time) {
		this.work_time = work_time;
	}
	public int getPer_pay() {
		return per_pay;
	}
	public void setPer_pay(int per_pay) {
		this.per_pay = per_pay;
	}
	public int getBase_pay() {
		return base_pay;
	}
	public void setBase_pay(int base_pay) {
		this.base_pay = base_pay;
	}
	public int getOver_pay() {
		return over_pay;
	}
	public void setOver_pay(int over_pay) {
		this.over_pay = over_pay;
	}
	public int getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}
	public WeekPayData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//계산으로 얻어지는 변수들은 빼고
	public WeekPayData(String name, int work_time, int per_pay) {
		super();
		this.name = name;
		this.work_time = work_time;
		this.per_pay = per_pay;
		Calculate();
	}
	
	public void Calculate()
	{
		base_pay = work_time * per_pay;
		over_pay=0;
		if(work_time>40)
		{
			over_pay = (work_time-40)*per_pay/2;
		}
		total_pay = base_pay + over_pay;
		
	}
	@Override
	public boolean equals(Object obj) {
		//이때 매개변수로 전달되는 object는 실제는 weekpaydata타입니다
		//다운캐스팅
		WeekPayData d1 = (WeekPayData)obj;
		return this.name.equals(d1.name);
	}
	@Override
	public String toString() {
		
		return String.format("%s \t%d\t %d\t %d\t %d\t %d", name,work_time,per_pay,base_pay,over_pay,total_pay);
	}
	
	//Comparable 인터페이스가 가지고 있는함수이다.
	/*
	 * WeekPayData 객체가 두개있을 때
	 * p2.compareTo(p2) <0 , ==0, >0
	 * p1이 사전순서상 p2보다 앞에 있을 때 <0
	 * p1이 사전순서상 p2와 같을 때 ==0
	 * p1이 사전순서상 p2보다 뒤에 있을 때 >0
	 * */
	@Override
	public int compareTo(Object o) {
		
		WeekPayData d = (WeekPayData)o;
		return total_pay-d.total_pay;
	}
	
	
	//데이터베이스 사용시 아래것들 다 필요없다. 계산은 담당
	//toString 오버라이딩
	//equals 오버라이딩(꼭 해야되는 거 아님, 이유는 데이터베이스를 사용하면 된다)
	//계산정도
	//생성자
	
}
