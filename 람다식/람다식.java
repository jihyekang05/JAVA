package 람다식;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 람다식 {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("모란","작약","목단","백일홍","국화");
		//forEach - 매개변수가 함수이다
		//이 함수는 반환값이 없고 매개변수는 배열의 요소이다
		//list의 각 요소마다 이 함수를 한번씩 호출한다
		list.stream().forEach((flower)->{
			System.out.println(flower);
		});
		
		//꽃이름에 홍자 들어간거 찾아서 출력해준다
		Stream<String> s = list.stream().filter(
				(item)->{
					return item.contains("홍");
				});
		s.forEach(System.out::println);
		
		List<Integer> nList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//출력 - 매개변수가 Consumer (소비자) 반환없이 매개변수만 받아간다
		nList.stream().forEach((n)->{
			System.out.println(n);
		});
		
		//이 함수 자체가 이미 매개변수 하나고 리턴값이 없는 함수이다.
		nList.stream().forEach(System.out::println);
		
		//짝수 홀수를 나누어서 별도의 리스트로 저장하자
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		
		for(int i=0; i<nList.size(); i++)
		{
			if(nList.get(i)%2==0)
			{
				evenList.add(nList.get(i));
			}
			else
			{
				oddList.add(nList.get(i));
			}
		}
		
		for(int i=0; i<evenList.size();i++)
		{
			System.out.printf("%3d",evenList.get(i));
			
		}
		System.out.println();
		for(int i=0; i<oddList.size();i++)
		{
			System.out.printf("%3d",oddList.get(i));
			
		}
		System.out.println();
		
		//위의 식을 람다식을 이용하여 표현
		Stream<Integer> even=nList.stream().filter((n)-> n%2 ==0);
		Stream<Integer> odd=nList.stream().filter((n)-> n%2 !=0);
		even.forEach(System.out::println);
		odd.forEach(System.out::println);
		
		nList.stream()
			.filter((n) -> n%2 == 0)
			.forEach(n->{System.out.printf("%3d",n);});
		System.out.println();
	}

}
