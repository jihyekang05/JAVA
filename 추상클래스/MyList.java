package 추상클래스;

public class MyList extends AbstractList{

	@Override
	public int find(Object obj) {
		for(int i=0; i<this.obj.length;i++)
		{
			if(this.obj[i]!=null && this.obj[i].equals(obj))
				return i;
		}
		return -1;
	}

	@Override
	public int sigma() {
		int sum = 0;
		for(int i=0; i<this.obj.length;i++)
			if(obj[i]!=null)
				sum += (Integer)(obj[i]);
		return sum;
	}

}
