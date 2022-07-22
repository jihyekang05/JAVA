package 멀티스레드;

class MultiThread implements Runnable{
	String threadName="";
	public MultiThread(String threadName)
	{
		this.threadName=threadName;
	}
	//Runnable 인터페이스를 상속받으면 반드시 run 메서드를 오버라이딩 해야 한다
	public void run() //스레드로 동작한다
	{
		for(int i=0; i<=100000; i++)
		{
			try {
				Thread.sleep(10); //스레드로 부터 시간을 뺏는다
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.printf("%s %d\n", threadName, i);
		}
	}
}
public class 멀티스레드 {
	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread("thread1");
		MultiThread mt2 = new MultiThread("thread2");
		
		//현재는 함수상태
		//mt1.run();
		//mt2.run();
		
		Thread th1 = new Thread(mt1);
		Thread th2 = new Thread(mt2);
		
		th1.start();
		th2.start();

		
	}
	

}
