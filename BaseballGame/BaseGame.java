import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseGame {
	List<BaseBallData> list = new ArrayList<BaseBallData>();
	void gameStart()
	{
		String again;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			BaseBallData d = new BaseBallData();
			list.add(d);
			d.start();
			System.out.print("계속?");
			again = sc.next();
			
		}while(again.toLowerCase().equals("y"));
	}

}
