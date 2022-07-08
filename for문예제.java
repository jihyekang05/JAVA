package for문예제;

public class for문예제 {

	public static void main(String[] args) {
		int i;
		
		System.out.println("1부터10까지 출력하기");
		
		for(i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("1부터10까지 옆으로 출력하기");
		for(i=1; i<=10; i++)
		{
			System.out.printf("%3d", i);//3자리 차지하고 뒤쪽부터 채워온다.
		}
		System.out.println();// 줄바꿈
		System.out.println("10,20,30...."); //println은 자동으로 다음줄로 넘겨준다.
		for(i=10; i<=100; i+=10)
		{
			System.out.printf("%3d",i);
			System.out.println();
		}
		
		
		
	}

}
