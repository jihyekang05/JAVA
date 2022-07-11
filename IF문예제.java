package for문예제2;
import java.util.Scanner;
public class for문예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//알파벳을 100개 출력한다. 
		
		int i;
		//System.out.println("알파벳 출력: ");
		for(i=1;i<=100;i++)
		{
			System.out.printf("%3d",i);
			if(i%10 == 0)
			{
				System.out.println();
			}
				
			
		}
		
		int k = 'A';
		for(i=1; i<=100; i++)
		{
			System.out.printf("%2c",k);
			k++;
			
			if(i%10==0)
					
				System.out.println();
				
			if(k>'Z')
			{
				k = 'A';
			}
					
		}
	}
}
