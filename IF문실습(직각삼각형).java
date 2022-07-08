package 직각삼각형;

import java.util.Scanner;

public class 직각삼각형 {

	public static void main(String[] args) {
		//1.입력 세변의길이
		//2.출력 직각삼각형 여부
		int a,b,c; //입력변수
		boolean result; //출력변수
		Scanner sc = new Scanner(System.in);
		int temp; 
		//3.입력
		System.out.print("첫번째 변");
		a = sc.nextInt();
		System.out.print("두번째 변");
		b = sc.nextInt();
		System.out.print("세번째 변");
		c = sc.nextInt();
		
		
		//4.제일 큰 값 찾기
		//
		if (a<b)
		{
			temp = a;
			a = b;
			b = temp;
			
		}
		if (a<c)
		{
			temp = a;
			a = c;
			c = temp;
			
		}
		System.out.println(String.format("%d %d %d", a,b,c));
		
		if( a*a == b*b + c*c)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		
		
		if(result)
		{
			System.out.println("직각삼각형입니다");
		}
		else
		{
			System.out.println("직각삼각형이 아닙니다");
		}
	}

}
