package 인터페이스응용;

//정렬은 데이터를 순서대로 늘어놓는것
//오름차순, 내림차순
//셀렉트, 버블, 삽입, 퀵정렬....
//셀렉트 정렬: 오름차순의 경우 제일 작은 것을 찾아다가 첫번째 방에 놓는다
//두번째 작은거 찾아다가 두번째 방에 놓는다
public class 인터페이스응용 {
	public static void selectSort(Object []arr)
	{
		int i,j;
		Object temp;
		
		
		for(i=0; i<arr.length-1; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				Comparable c1 = (Comparable)arr[i];
				Comparable c2 = (Comparable)arr[j];
				if(c1.compareTo(c2)>0)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		//int - 값타입: 갸
		Integer []arr = new Integer[] {3,1,7,8,5,4,9,10,2};
		selectSort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%4d",arr[i]);
		}
		System.out.println();
	}
}
