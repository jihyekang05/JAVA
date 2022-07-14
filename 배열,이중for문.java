package 연습문제;

public class 연습문제8_2 {
	
	static void display(int [][]a)
	{
		int i,j;
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a[i].length; j++)
			{
				System.out.printf("%4d", a[i][j]);
			}System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = new int [][]{{1,2,3,4,0},
								 {5,6,7,8,0},
								 {9,10,11,12,0},
								 {13,14,15,16,0},
								 {0,0,0,0,0}};
		display(a);
		
		int i,j;
		//행의 합
		for(i=0; i<4; i++)
		{
			for(j=0; j<4; j++)
			{
				a[i][4] += a[i][j];
			}
		}
		//열의 합
		for(i=0; i<4; i++)
		{
			for(j=0; j<4; j++)
			{
				a[4][i] += a[j][i];
			}
		}
		
		display(a);
		
		for(i=0;i<4;i++)
		{
			a[4][4] += a[i][4];
		}
		
		display(a);
		
		
		//연습문제9
		a = new int[10][10];
		//display(a);
		int k=1;
		int num=1;
		for(i=0; i<10;i++)
		{
			for(j=9-i;j<10;j++)
			{
				a[i][j]=k++;
			}
		}
		display(a);
		
		//연습문제10
		k=1;
		a = new int[10][10];
		for(i=0; i<10; i++)
		{
			for(j=0;j<=i;j++)
			{
				a[j][i]=k++;
			}
		}
		display(a);
	}

}

----------------------------------------------------
  package 연습문제;

class MySet
{
	int a[] = new int [] {1,6,12,5,13,20};
	int b[] = new int [] {13,7,6,24,14};
	
	int find(int b[],int key)
	{
		for(int i=0; i<b.length; i++)
		{
			if( key == b[i])
			{
				return i;
			}
		}return -1;
	}
	
	//교집합 구하기
	void intersect()
	{
		int result[] = new int [10];
		int cnt = 0;
		int i;
		for(i=0; i<a.length; i++)
		{
			if(find(b,a[i])!=-1)
			{
				result[cnt]=a[i];
				cnt++;
			}
		}
		
		for(i=0; i<cnt; i++)
		{
			System.out.printf("%4d",result[i]);
		}
		System.out.println();	
		
	}
	
	//합집합 구하기
	//합집합 a배열을 result에 복사하고 나서b배열의 값을 result배열에서 찾아서 없으면
	//result에 추가
	
	void unionsect()
	{
		int result[]=new int[20];
		int cnt=0;
		int i;
		
		//a배열을 result로 복사
		for(i=0; i<a.length;i++)
		{
			result[cnt] = a[i];
			cnt++;
		}
		//b배열의 요소들이 result 뱅려에 존재하지 않는 것만 result에 추가
		for(i=0; i<b.length; i++)
		{
			if(find(result,b[i])==-1)
			{
				result[cnt] = b[i];
				cnt++;
				
			}
		}
		for(i=0; i<cnt; i++)
		{
			System.out.printf("%4d",result[i]);
		}
		System.out.println();	
	}
}
public class 연습문제5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySet myset = new MySet();
		myset.intersect();
		myset.unionsect();

	}

}

  
