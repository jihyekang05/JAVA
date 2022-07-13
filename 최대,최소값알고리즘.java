package 알고리즘;

public class BaseAlgorithm {
		//최대값 고르기
	void showMax()
	{
		int arr[] = {3,4,-3,5,9,10,11,27,35};
		// 배열에서 가장 큰값을 찾아보자
		int max; //여기에 제일 큰 값이 있다고 가정
		int pos=0;//최대값 위치값이 0번째라고 가정
		max = arr[0];//  첫번째 데이터가 제일 크다고 가정
		for(int i=1; i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				pos = i;
			}
		}
		System.out.println("최대값: " + max + " 번지수: "+ pos);
	}
	
	int getMax(int []arr)
	{
		int max = arr[0];
		int pos = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				pos = i;
			}
		}return pos;
	}
	//최소값 찾기
	int getMin(int []arr)
	{
		int min = arr[0];
		int pos = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
				pos = i;
			}
		}return pos;
	}

	
	public static void main(String[] args) {
		BaseAlgorithm a = new BaseAlgorithm();
		a.showMax();
		int arr[] = new int[] {4,5,6,0,99};
		int pos = a.getMax(arr);
		int pos_min = a.getMin(arr);
		System.out.printf("위치: %d 값:%d\n",pos,arr[pos]);
		System.out.printf("위치: %d 값:%d",pos_min,arr[pos_min]);
		
		

	}

}
