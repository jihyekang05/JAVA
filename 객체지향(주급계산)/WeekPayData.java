package 주급계산2;

public class WeekPayData {
	private String name="";
	private int work_time=0;
	private int per_pay=0;
	private int base_pay=0;
	private int over_pay=0;
	private int total_pay=0;
	
	public void process()
	{
		base_pay = work_time * per_pay;
		over_pay = 0;
		if(work_time>40)
		{
			over_pay = (work_time-40)*per_pay/2;
		}
		total_pay = base_pay + over_pay;
	}

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
	

	

}
