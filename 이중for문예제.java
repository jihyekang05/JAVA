package 이중for문;

public class 이중for문 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.printf("i=%d j=%d ",i,j);
				System.out.println();
			}
		}
		
		//이중 for문을 사용해서
		int k = 1;
		for(i=1;i<=2;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.printf("%4d",k);
				k++;
				
				
			}
			System.out.println();
		}
		
		//다이아몬드 그리기
		int line = 5;
		for(i=1;i<6;i++)
		{
			for(k=5;k>i;k--)
			{
				System.out.printf(" ");
				
			}
			
			for(j=1;j<(i*2);j++)
			{
				System.out.printf("*");
			}
			System.out.println();
		}
		for(i=1;i <= line; i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*line-2*i-1;j++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
		
		
		//다른 문제
		int sum;
		for(i=1; i<=10;i++)
		{
			sum=0;
			for(j=1; j<=i; j++)
			{
				System.out.printf("%2d", j);
				sum +=j;
				if(j<i)
				{
					System.out.printf(" +");
				}
			}
			System.out.println(" = " + sum);
		}
		
		//알파벳 출력,A부터, B부터~마지막A,C부터~마지막 ..AB
		
		for(i='A';i<='Z';i++)
		{	for(j=i;j<='Z';j++)
			{
			System.out.printf("%c",j);
			}
			
			for(k='A';k<i;k++)
				{
					System.out.printf("%c",k);
				}
			
			
		System.out.println();
		
		
		}
		
		

	}

}



