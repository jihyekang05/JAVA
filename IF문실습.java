package 성적처리;

import java.util.Scanner;

public class 성적처리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor,eng,math,sum;
		double avg;
		String name,res;
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3.0f;
		
		if (avg >= 90)
		{
			res = "수";
		}
		else if(avg >= 80)
		{
			res = "우";
		}
		else if(avg >= 70)
		{
			res = "미";
		}
		else if(avg >= 60)
		{
			res = "양";
		}
		else
			
		{
			res = "가";
		}
		
		System.out.println(String.format("%s 씨의 총점은 %d이고 평균은 %.2f, 등급은 %s입니다", name,sum,avg,res));

	}

}
