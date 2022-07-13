package 다차원배열;

public class 다차원배열 {

	public static void main(String[] args) {
		//2차원부터 다차원이라고 한다
		int a[][] = new int[5][];
		//2차원의 경우에 자바는 배열 자체가 참조라서 
		//2차원이 되면 참조의 참조가 된다
		//위 배열의 경우 처음에 만든 int[5]는 
		//배열의 주소를 저장할 참조변수 공간 5를 만들라는 의미다.
		
		a[0] = new int[] {1,2,3};
		a[1] = new int[] {1,2,3,4,5};
		a[2] = new int[] {1,2,30,40};
		a[3] = new int[] {1,2,3,4,5,6,7};
		a[4] = new int[] {1,2,3};
		
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0; j<a[i].length; j++)
			{
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		
		//System.out.println(a[1].length);//각 행의 길이
		//System.out.println(a[1]);//a[1]의 주소값이 출력된다.
		
		
		//1차원 배열 복사하기
		int []arr = new int[] {1,3,5,7,9,11,13,15,17,19};
		int []brr;
		
		brr = arr; //이 복사는 얕은복사, 배열의 주소만 복사된다.
				  //둘이 같은 배열이다.
		brr[0] = 100;
		brr[3] = 300;
		System.out.println("얕은복사");
		for(i=0; i<arr.length;i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		
		for(i=0; i<brr.length;i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		
		
		//깊은복사
		System.out.println("깊은복사");
		brr = new int[arr.length];
		for(i=0; i<arr.length;i++)
		{
			brr[i]=arr[i];
			
		}
		brr[0]=12;
		brr[3]=17;
		
		for(i=0; i<brr.length;i++)
		{
			System.out.printf("%4d", brr[i]);
		}
		System.out.println();
		
		for(i=0; i<brr.length;i++)
		{
			System.out.printf("%4d", brr[i]);
		}
		System.out.println();


	}

}
