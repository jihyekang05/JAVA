package 추상클래스;

public abstract class AbstractList {

	protected Object []obj;
	protected int size;
	public AbstractList()
	{
		size=10;
		obj = new Object[size];
	}
	public AbstractList(int size)
	{
		if(size<10)
			size=10;
		this.size = size;
		obj = new Object[this.size];
	}
	public void set(int pos, Object val)
	{
		if(pos<0 || pos > this.size)
		{
			return;
		}
		this.obj[pos]=val;
	}
	public Object get(int pos)
	{
		if(pos<0 || pos>=size)
		{
			return obj[0];
		}
		return obj[pos];
	}
	
	public int length()
	{
		return size;
	}
	
	//이 부분은 검색부분인데 상속받는 쪽에서 만들어 써라
	public abstract int find(Object obj);
	
	public abstract int sigma();
}
