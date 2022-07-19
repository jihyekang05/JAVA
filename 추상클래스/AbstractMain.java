package 추상클래스;

public class AbstractMain {
	public static void main(String[] args) {
		
		AbstractList list = new MyList();
		list.set(0,"목련");
		list.set(1,"작약");

		list.set(2,"국화");
		list.set(3,"철쭉");
		
		for(int i=0; i<list.length();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println(list.find("국화"));
		System.out.println(list.find("아이리스"));
		
		list = new MyList();
		list.set(0,1);
		list.set(1,2);
		list.set(2,3);
		list.set(3,4);
		list.set(4,5);
		list.set(5,6);
		list.set(6,7);
		list.set(7,8);
		list.set(8,9);
		list.set(9,10);
		System.out.println(list.sigma());
		

	}

}
