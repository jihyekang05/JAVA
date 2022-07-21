
public class StringBuffer클래스 {
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("This");
		buffer.append(" ");
		buffer.append("is");
		buffer.append(" ");
		buffer.append("StringBuffer");
		
		System.out.println(buffer.toString());
		
		long startTime = System.currentTimeMillis();
		String temp="";
		for(int i=1; i<=100; i++)
		{
			temp += String.valueOf(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("걸린시간 "+ (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		buffer = new StringBuffer();
		for(int i=1; i<=100; i++)
		{
			buffer.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("걸린시간 "+ (endTime-startTime));
		
		buffer = new StringBuffer("Hello java");
		buffer.setCharAt(0, 'h');
		System.out.println(buffer);
		
	}

}
