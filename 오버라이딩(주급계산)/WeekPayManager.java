import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeekPayManager {
	List<WeekPayData> list = new ArrayList<WeekPayData>();
	
	public WeekPayManager() {
		super();
		list.add(new WeekPayData("A", 40, 10000));
		list.add(new WeekPayData("B", 30, 30000));
		list.add(new WeekPayData("C", 20, 15000));
		list.add(new WeekPayData("D", 50, 10000));
		list.add(new WeekPayData("E", 60, 20000));
	}
	public void append()
	{
		Scanner sc = new Scanner(System.in);
		WeekPayData data = new WeekPayData();
		System.out.print("이름: ");
		data.setName(sc.next());
		System.out.print("근무시간: ");
		data.setWork_time(sc.nextInt());
		System.out.print("시간당 급여액: ");
		data.setPer_pay(sc.nextInt());
		data.Calculate();
		list.add(data);//리스트에 추가
		//sc.close();
	}
	public void output()
	{
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		int menu;
		while(true)
		{
			menuDisplay();
			System.out.print("선택: ");
			menu = sc.nextInt();
			switch(menu)
			{
			case 1:append();break;
			case 2:output(); break;
			case 3:search();break;
			case 4:sort();break;
			case 0: System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("존재하지 않는 메뉴입니다");
			
			
			}
		}
		
	}
	
	public void menuDisplay()
	{
		System.out.println("1. 데이터 추가");
		System.out.println("2. 전체 출력");

		System.out.println("3. 검색");
		System.out.println("4. 정렬");
		
		System.out.println("0. 종료");

		
	}
	
	public void sort()
	{
		list.sort(null);
		output();
	}
	
	public void search()
	{
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		name = sc.next();
		int pos = list.indexOf(new WeekPayData(name,0,0));
		if( pos == -1)
		{
			System.out.println(name + "은 없습니다");
		}
		else
		{
			System.out.println(list.get(pos));
		}
	}

}
