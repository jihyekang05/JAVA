package 성적처리;

public class ScoreData {
	private String name="";
	private int kor=0;
	private int eng=0;
	private int math=0;
	private int total=0;
	private float avg=0;
	
	public void setValue(String name, int kor, int eng, int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calculator();
		
	}
	
	public void calculator()
	{
		this.total = kor + eng + math;
		this.avg = total/3.0f;
	}
	
	public void display()
	{
		System.out.printf("%s\t",name);
		System.out.printf("%d\t",kor);
		System.out.printf("%d\t",eng);
		System.out.printf("%d\t",math);
		System.out.printf("%d\t",total);
		System.out.printf("%f\n",avg);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
	
	
	

}
