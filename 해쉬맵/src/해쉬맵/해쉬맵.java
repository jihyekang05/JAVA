package 해쉬맵;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;




public class 해쉬맵 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		//Map - 부모클래스(추상)
		//HashMap - 실체클래스
		//Map 이라는 요소가 키와 값 쌍으로 된 값을 저장할 수 있다
		//그래서 Map<키값의 타입, 저장할 값의 타입>
		
		map.put("red","빨간색");//키와 값-키는 보통 String의 경우가 많다.
		map.put("green","초록색");
		map.put("blue","파란색");
		map.put("magenta","분홍색");
		map.put("cyan","하늘색");
		map.put("yellow","노랑색");
		
		//키를 통해서 값을 알수는 있지만 값을 통해서 키를 알 수 없다.
		//키가 없는 경우에는 만들지만, 있는 경우에는 앞의 것을 덮어쓴다.
		System.out.println(map.get("red"));
		
		//존재하지 않는 키를 내놓으라고 하면 에러남
		System.out.println(map.get("black"));
		
		//새로운 키를 추가하거나 업데이트하려면 put 함수를 사용한다
		map.put("White","흰색"); //없었던 것이라 추가
		map.put("cyan", "옅은 파랑");//존재했던 것은 수정
		
		//삭제
		map.remove("red");//해당 키가 있으면 삭제된다.
		
		//list 하고 달라서 키목록 가져와야한다
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) //데이터가 있으면 true 없으면 false
		{
			//현재 데이터를 반환하면서 내부에서 다음요소로 이동한다
			System.out.println(it.next());
		}
		
		Map<String,AddressData> map2 = new
				HashMap<String,AddressData>();
		map2.put("홍길동", new AddressData("홍길동","1","11"));
		map2.put("임꺽정", new AddressData("임꺽정","2","22"));
		map2.put("장길산", new AddressData("장길산","3","33"));
		map2.put("조승연", new AddressData("조승연","4","44"));
		map2.put("홍경래", new AddressData("홍경래","5","55"));
		
		it = map2.keySet().iterator();
		while( it.hasNext())
		{
			String key = it.next();
			AddressData temp = map2.get(key);
			System.out.println(temp);
		}
	}

}
