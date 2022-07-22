package 람다식;

import java.util.Arrays;

//함수형 인터페이스
@FunctionalInterface
interface MyInterface{
	int calc(int x,int y); 
	//int calc(int x,int y)모양의 함수 하나가 저장가능하다
}

//이전에 인터페이스는 상속을 받아 구현, 이제는 함수의 매개변수로 전달이 가능하다
//제한사항: 이 인터페이스는 무조건 함수가 하나만 있어야 한다
@FunctionalInterface
interface Compare{
	int compareTo(Object o1, Object o2);
}
 class Sort
 {
	 void selectSort(Object []arr, Compare comp)
	 {
		 for(int i=0; i<arr.length-1; i++)
		 {
			 for(int j=i+1; j<arr.length;j++)
			 {
				 if(comp.compareTo(arr[i],arr[j])>0)
				 {
					 Object temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
	 }
 }
public class 람다식2 {
	public static void main(String[] args) {
		//함수를 저장한다
		MyInterface mi = (x,y) -> {return x+y;};
		
		System.out.println( mi.calc(7, 5));
		
		String []sList = new String[] {"red","green","blue","magenta","black","orange"};
				Sort s = new Sort();
				s.selectSort(sList, (s1,s2)-> {return ((String)s1).compareTo((String)s2);});
				
		for(String item:sList)
			System.out.println(item);
		}
	}


