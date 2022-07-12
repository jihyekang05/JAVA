package 배열;

public class 배열 {

	public static void main(String[] args) {
		/*
		 * 자바는 변수가 값변수와 참조변수로 나뉜다
		 * 값변수는 스택이라는 공간에 자리를 차지한다
		 * 변수를 선언한면 그 변수에 값을 읽고 쓸 수 있다
		 * int, float, long, double, char 등이 있다
		 * 참조변수는 힙이라는 공간에 자리를 차지한다
		 * 참조변수는 클래스(String도 클래스에 해당)와 배열만 있다.
		 * 참조변수는 변수를 선언해도 실제 데이터가 들어갈 공간은 없고
		 * 별도로 데이터가 들어갈 공간을 확보해야 한다.
		 * int []arr = new int[5];
		 * 처럼 변수를 선언 후 new라는 연산자를 이용해 데이터가 들어갈
		 * 공간을 별도로 확보해야 한다. 이 메모리는 나중에 사용하지 않을 때 gabage
		 * collector라는 프로그램이 알아서 제거한다.
		 * */
		
		int []arr; //배열변수 선언, 참보변수라서 데이터가 들어갈 공간이 없다
		arr = new int[5]; //힙공간에 정수 5개 들어갈 공간을 확보하고
						 //첫번째방의 번지를 전달한다
						//만일에 힙공간이 남은게 없어서 할당불가일때는 null값을
						//전달한다
		//배열의 요소에 데이터를 읽고 쓰는 방법은 인덱스방식이다.
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//10, 20, 30
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = (i+1)*10;
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
------------------------------------------------------------------
  package 배열;
import java.util.Scanner;
public class 배열2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		//정수 10개 읽어서 배열에 넣어놓고 그 합을 구하여 출력하기
		int i;
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.printf("정수(%d) : ",i+1);
			arr[i] = sc.nextInt();
		}
		
		for(i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println(arr.length);

	}

}
