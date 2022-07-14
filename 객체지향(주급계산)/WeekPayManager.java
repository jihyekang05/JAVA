package 주급계산2;

import java.util.Scanner;

public class WeekPayManager {
	final int MAX = 10;
	WeekPayData[] data = new WeekPayData[MAX];
	int count=0;
	
	public void append()
	{
		String again;
		Scanner sc = new Scanner(System.in);
		do
		{
			data[count] = new WeekPayData();
			System.out.print("이름: ");
			data[count].setName(sc.next());
			System.out.print("시간: ");
			data[count].setWork_time(sc.nextInt());
			System.out.print("시간당급여: ");
			data[count].setPer_pay(sc.nextInt());
			data[count].process();
			count++;
			System.out.print("계속?y/n");
			again = sc.next();
			
			
		}while(again.toLowerCase().equals("y"));
		sc.close();
		
	}
	
	public void output()
	{
		for(int i=0; i<count;i++)
		{
			System.out.printf("%s\t",data[i].getName());
			System.out.printf("%d\t",data[i].getWork_time());
			System.out.printf("%d\t",data[i].getPer_pay());
			System.out.printf("%d\t",data[i].getBase_pay());
			System.out.printf("%d\n",data[i].getTotal_pay());
			
			
		}
	}

}
