package 성적처리;

import java.util.Scanner;

public class ScoreManager {

	final int MAX=10;
	ScoreData[] dataList = new ScoreData[MAX];
	//데이터 들어갈 공간 없음
	int count=0;//실제로 입력된 데이터 개수
	
	public void init()
	{
		for(int i=0; i<MAX; i++)
		{
			dataList[i] = new ScoreData();
			
		}
		
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		String again;
		
		do
		{
			if(count>=MAX)
			{
				System.out.println("메모리가 부족합니다");
				return;//함수가 종료
			}
			System.out.print("이름: ");
			dataList[count].setName( sc.next());
			System.out.print("국어: ");
			dataList[count].setKor(sc.nextInt());
			System.out.print("영어: ");
			dataList[count].setEng(sc.nextInt());
			System.out.print("수학: ");
			dataList[count].setMath(sc.nextInt());
			dataList[count].calculator();
			count++;
			System.out.print("계속(y/n)? ");
			again = sc.next();
			
		}while(again.toLowerCase().equals("y"));
	}
	
	public void output()
	{
		for(int i=0; i<count; i++)
		{
			dataList[i].display();
			System.out.println();
		}
	}
}
