package 컬렉션클래스;

import java.util.ArrayList;
import java.util.List;

public class 컬렉션클래스 {
	//ArrayList - 배열과 링크드리스트 중간쯤
	//			- 어떤형태의 데이터라도 저장이 가능하고
	//			  데이터 추가나 수정 삭제가 마음대로 가능하다.
	//본개의 배열은 프로그램 시작전에 메모리가 확정되어야 한다.
	//인덱스로 데이터 접근이 가능하다 자바로 오면서 배열이
	//동적할당이 가능해진다.
	//int a[10]; - c언어
	//int []a = new int[10]; 자바는 배열의 인덱싱만 가지고 온다
	//a = new int[20];
	
	//링크드리스트 구조는 필요한만큼만 메모리 확보 뒤에다가 다음번 요소에 대한
	//번지를 저장하는 형태로 데이터를 저장한다
	//java.util.ArrayList이다.
	//java.util.List 는 ArrayList이 부모클래스이다.
	//나중에 ArrayList를 누군가 업데이트를 한다.
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("장미");
		sList.add("작약");
		sList.add("목련");
		sList.add("프리지아");
		sList.add("장미");

		for(int i=0; i<sList.size();i++)
		{
			System.out.println(sList.get(i));
		}
		
		System.out.println("중간에 끼워넣기");
		sList.add(0,"국화");
		for(int i=0; i<sList.size();i++)
		{
			System.out.println(sList.get(i));
		}
		
		System.out.println("데이터 삭제하기");
		sList.remove(0);
		sList.remove("작약");
		for(int i=0; i<sList.size();i++)
		{
			System.out.println(sList.get(i));
		}
		
		System.out.println("데이터 수정하기");
		sList.set(0, "모란");
		sList.set(1, "백일홍");
		for(int i=0; i<sList.size();i++)
		{
			System.out.println(sList.get(i));
		}
		
		System.out.println("데이터 검색하기");
		System.out.println("백일홍 위치값:"+sList.indexOf("백일홍"));
		System.out.println("천일홍 위치값:"+sList.indexOf("천일홍"));
		
		System.out.println();
		
		System.out.println("데이터 검색하기");
		System.out.println("백일홍 위치값:"+sList.lastIndexOf("백일홍"));
		System.out.println("천일홍 위치값:"+sList.lastIndexOf("천일홍"));
		
		//index 함수나 lastIndexOf 함수는 데이터가 하나밖에 없을때는 동일함
		List<Integer> nList = new ArrayList<Integer>();
		//주의점 List<int> 이건 불가능하다
		//ArrayList에는 참조형태만 저장 가능하다
		//int => Integer, double => Double, float => Float형태로
		nList.add(3);
		nList.add(1);
		nList.add(3);
		nList.add(2);
		nList.add(3);
		
		System.out.println(nList.indexOf(3));
		System.out.println(nList.lastIndexOf(3));
		
		System.out.println("---정렬하기---");
		
		sList.sort(null);
		for(int i=0; i<sList.size();i++)
		{
			System.out.println(sList.get(i));
		}
		
		System.out.println("---뒤집기---");
		
		for(int i=sList.size()-1; i>=0;i--)
		{
			System.out.println(sList.get(i));
		}
		
		//최근에 발현된 문법 -- 람다식: 함수를 간단하게 한번쓰고 버리는 형식
		sList.stream().forEach((e) -> {System.out.println(e);});
		
		
	}
	
	
	
	

	

}
