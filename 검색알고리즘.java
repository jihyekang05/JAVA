package 검색알고리즘;

/*
 * 검색 - 배열로부터 원하는 데이터의 위치르 찾는 것
 * 
 * 1. 선형검색 : 데이터를 처음부터 순서대로(순차대로) 읽어서 원하는 데이터를 찾을 때까지 검색을
 * 				반복한다. 구현이 쉽지만 제일 느리다, 데이터를 찾을 때까지 검색을 반복한다.
 * 			  데이터가 100반번째에 있으면 100만번 검색해서 찾아야 한다.
 * 2. 이분검색 : 데이터를 정렬시켜놓고 데이터를 둘로 나누어서 찾고자 하는 값이 앞의 그룹에 속하는지
 * 			  뒤의 그룹에 속하는지 판단 후 앞또는 뒤를 버린다. 이 과정을 반복, 선형검색보다 빠르다.
 * 		      데이터가 자주 바뀔경우, 정렬시간이 더 오래걸린다는 단점이 있다.
 * 3. 해쉬검색 : 해쉬함수를 만들어서 데이터를 특정 메모리로 매핑시킨다.
 * 			   해쉬테이블을 한번 구성하면, 데이터 검색시 해쉬함수를 이용해 이론상 한번에 검색이 가능하다. 
 * 			   가장 빠른 검색수단이나 메모리를 가장 많이 사용하고 구현이 어렵다. HashMap 클래스 지원한다.
 * */

public class 검색알고리즘 {
	//선형검색- 배열로부터 키(찾는데이터)값을 찾아서 위치를 반환하자
	//		  키값이 없을때는 (함수 안에 문제가 생기면) -1을 반환한다
	int find(int arr[], int key)
	{
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i] == key)
				return i;
		}
		return -1;//키 값이 없을 때
	}
	
	//이분검색
	int div(int arr[],int key)
	{
		int lt = 0;
		int rt = (arr.length)-1;
		int mid;
		int res=0;
		boolean found=false;
		
		while(lt<=rt)
		{
			mid = (lt+rt)/2;
			if(arr[mid]==key)
			{
				res = mid;
				found = true;
				break;
			}
			else if(key<arr[mid])
			{
				rt+=1;
			}
			else
			{
				lt+=1;
			}
			
		}
		if (found)
			return res;
		else
			return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		검색알고리즘 a = new 검색알고리즘();
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int pos = a.find(arr, 5);
		if(pos== -1)
		{
			System.out.println("not found");
		}
		else
			System.out.println("position: "+pos);
		
		///탐색알고리즘 함수 구현
		int ark[] = new int[] {1,3,5,6,7};
		int ai = a.div(ark,6);
		System.out.printf("key값과 일치하는배열의 값은: %d, 위치: %d",ark[ai],ai+1);
		
		
	}
	/*
	 *  	1 2 4 5 7 8 9 10 11 12
	 * key=10
	 * left		right		mid		arr[mid]
	 *  0		 9  	(0+9)/2=4     7
	 * 
	 * arr[mid]>key    arr[mid]<key     arr[mid]==key
	 * right = mid-1	left = mid+1	 found
	 * 5        9            7          10				
	 * 
	 * */

}

