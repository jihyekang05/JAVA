package 가위바위보게임;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		int computer;
		int person;
		int winner;
		String again;
		//1.컴퓨터가 난수발생을 통해서 1,2,3중에 선택
		//2.사람한테 1.가위 2.바위 3.보 입력받기
		//3.컴퓨터와 승부 나타내기
		Scanner sc = new Scanner(System.in);
		computer = (int)(Math.random()*3)+1;
		System.out.print("1.가위, 2.바위, 3.보 선택하기: ");
		person = sc.nextInt();
		
			if(computer == 1)
			{
				if(person == 1)
				{
					System.out.printf("비겼습니다.");
					
				}
				else if(person == 2)
				{
					System.out.printf("이겼습니다.");
				}
				else
				{
					System.out.printf("졌습니다.");
				}
			}
			else if(computer == 2)
			{
				if(person == 1)
				{
					System.out.printf("졌습니다.");
				}
				else if(person == 2)
				{
					System.out.printf("비겼습니다.");
				}
				else
				{
					System.out.printf("이겼습니다.");
				}
				
				
			}
			else
			{
				if(person == 1)
				{
					System.out.printf("이겼습니다.");
				}
				else if(person == 2)
				{
					System.out.printf("졌습니다.");
				}
				else
				{
					System.out.printf("비겼습니다.");
				}
				
		}
	}

}
