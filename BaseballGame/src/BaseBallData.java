import java.util.Scanner;

public class BaseBallData {
	int computer[] = new int[3];
	int person[] = new int[3];
	int result[] = new int[3]; 
	//맨첫번째방에 strike, ball, out
	
	int find(int[]arr, int cnt, int value)
	{
		for(int i=0; i<cnt; i++)
		{
			if(arr[i]==value)
				return i;
			
		}return -1;
	}
	
	//computer라는 배열에 0~9까지의 정수3개를 중복되지 않게 입력한다.
	public void init()
	{
		int cnt=0;
		while(cnt<3)
		{
			int temp = (int)(Math.random()*10);
			int pos=find(computer, cnt, temp);
			if(pos == -1)//중복이 아닐때만 데이터를 배열에 넣는다
			{
				computer[cnt] = temp;
				cnt++;
			}
		}
		
		
	}
	
	//사람한테 숫자 3개 입력받아서 person배열에 넣자
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		int cnt=0;
		while(cnt<3)
		{
			System.out.print("숫자: ");
			int temp = sc.nextInt();
			int pos=find(person, cnt, temp);
			if(pos == -1)//중복이 아닐때만 데이터를 배열에 넣는다
			{
				person[cnt] = temp;
				cnt++;
			}
			else
				System.out.println("서로 다른 숫자 3개를 입력하라");
		}
		
	}
	public void process()
	{
		result[0]=0;
		result[1]=0;
		result[2]=0;
		//사람이 입력한 값이 컴퓨터에 있는지 알아보자
		for(int i=0; i<3; i++)
		{
			int pos = find(computer,3,person[i]);
			if(pos==-1) //out
				result[2]++;
			else
			{
				if(pos==i)
				{
					result[0]++;//스트라이크 증가
				}
				else
				{
					result[1]++;//볼 증가
				}
			}
		}
	}
	public void start()
	{
		init();
		System.out.printf("%d %d %d",computer[0],computer[1],computer[2]);
		
		int cnt=1;
		while(cnt<=7)
		{
			input();
			process();
			System.out.printf("%d strike %d ball %d out\n",
					result[0],result[1],result[2]);
			if(result[0]==3)
			{
				System.out.println("축하합니다.");
				break;
			}
			cnt++;
		}
		if(result[0] !=3)
		{
			System.out.println("아쉽습니다");
		}
		
	}
}
