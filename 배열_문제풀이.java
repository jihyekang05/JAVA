package 문제풀이;
import java.util.Scanner;
class Example
{
	Scanner sc = new Scanner(System.in);
	void answer1()
	{
		char ch[]=new char[10];
		int i;
		for(i=0;i<ch.length;i++)
		{
			ch[i] = (char)(sc.next().charAt(0));
		}
		System.out.printf("%c %c %c\n", ch[0],ch[4],ch[6]);
	}
	
	//break문
	void answer2()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			if(i==5) {break;}
		}
	}
	
	void answer3()
	{	int count=0;
		int num;
		int arnum[] = new int[100];
		for(int i=0;i<arnum.length;i++)
		{
			System.out.printf("숫자입력(%d): ",i);
			arnum[i]=sc.nextInt();
			count++;
			if(arnum[i]==0)
				break;

		}
		for(int i=count-2;i>=0;i--)
		{
			System.out.printf("%2d",arnum[i]);
		}
	
	}
	
	void answer4()
	
	{
		int a,b;
		double sum=0;
		//초기값을 배열을 선언하면서 값을 넣는다.
		//배열의 크기를 주면 안된다. {}사이에 초기값을 넣는다.
		double avg[]=new double[] {85.6,79.5,83.1,80.0,78.2,75.0};
		System.out.print("첫번째 반입력: ");
		a = sc.nextInt();
		System.out.print("두번째 반입력: ");
		b = sc.nextInt();
		sum = avg[a-1]+avg[b-1];
		System.out.printf("두 반의 평균: %.1f",sum/2);
		
		
	}
	
	

}
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		//ex.answer1();
		ex.answer2();
		//ex.answer3();
		ex.answer4();

	}

}
