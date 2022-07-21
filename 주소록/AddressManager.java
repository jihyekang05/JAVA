package 주소록;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressManager {
	List<AddressData> list = new ArrayList<AddressData>();
	
	public AddressManager()
	{
		list.add(new AddressData("a","1","1@ddde.com"));
		list.add(new AddressData("b","2","2@ddde.com"));
		list.add(new AddressData("c","3","3@ddde.com"));
		list.add(new AddressData("d","4","4@ddde.com"));
		list.add(new AddressData("e","5","5@ddde.com"));
	}
	
	void menuDisplay()
	{
		System.out.println("1. 추가");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 전체출력");
		System.out.println("6. 정렬");
		System.out.println("0. 종료");
	}
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			menuDisplay();
			System.out.print("선택: ");
			int sel = sc.nextInt();
			
			switch(sel)
			{
			case 1: append(); break;
			case 2:search(); break;
			case 3: modify(); break;
			case 4: delete(); break;
			case 5: output(); break;
			case 6: sort(); break;
			case 0: System.out.println("프로그램을 종료합니다"); 
					return;
			default:System.out.println("잘못 선택하셨습니다");
			
			}
		}
		
	}
	void append()
	{
		//객체 하나 만들고
		AddressData data = new AddressData();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		data.setName(sc.next());
		System.out.print("전화번호: ");
		data.setPhone(sc.next());
		System.out.print("이메일: ");
		data.setEmail(sc.next());
		
		list.add(data);
		
	}
	
	void output()
	{
		for(AddressData data : list)
		{
			System.out.println(data);
		}
	}
	
	//검색해서 위치값을 반환하는 함수 만들어서 검색,수정,삭제해서 써보자
	int find()
	{
		String key;
		int type;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.이름 2.전화번호 3.이메일");
		type = sc.nextInt();
		System.out.print("찾을 값: ");
		key = sc.next();
		
		AddressData data = new AddressData(key,type);
		return list.indexOf(data); //없으면 -1, 있으면 위치값 반환
	}
	
	void search()
	{
		int pos = find();
		if( pos == -1)
		{
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		System.out.println(list.get(pos));
	}
	void modify()
	{
		int pos = find();
		if( pos == -1)
		{
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		AddressData data = list.get(pos);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		data.setName(sc.next());
		System.out.print("전화번호: ");
		data.setPhone(sc.next());
		System.out.print("이메일: ");
		data.setEmail(sc.next());
		System.out.println("수정되었습니다. ");
		
	}
	
	void delete()
	{
		int pos = find();
		if( pos == -1)
		{
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		list.remove(pos);
		System.out.println("삭제되었습니다. ");
		
	}
	
	void sort()
	{
		int type;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.이름 2.전화번호 3.이메일");
		type = sc.nextInt();
		AddressData.setType(type);
		
		list.sort(null);
		output();
		
	}

}
