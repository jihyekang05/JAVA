package while문연습;
import java.util.Scanner;
public class while문연습 {

	public static void main(String[] args) {
		int i;
		
		i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		//입력값이 양의 정수인 동안만 합을 구해서 평균을 출력하자
		//종료값이 음수가 들어오면 종료하자
		int num;
		int sum;
		int cnt;
		Scanner sc = new Scanner(System.in);
		
		sum=0;
		cnt=0;
		System.out.print("숫자 : ");
		num = sc.nextInt();
		while(num>0)
		{
			sum+=num;
			cnt++;
			
			System.out.print("숫자 : ");
			num = sc.nextInt();
			
			
		}
		System.out.println("평균: " + (sum/cnt));
		
		//do while(무조건 한 번은 수행한다.)
		i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		

	}

}


--------------------------------------------------------------
  package while문연습문제;
//(연습문제 1)  1 ~ n 까지의 정수의 합산이 1000을 넘는 최초의    n 값을 구하시오.
public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		
		while(sum<=1000)
		{
			sum += i;
			i++;
		}
		System.out.printf("%d",i-1);
		

}

}
