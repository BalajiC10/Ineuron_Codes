package im.practice;

public class LaunchMT {

	public static void main(String[] args) throws InterruptedException {
			/*
			 * Purpose of MT:-To reduec CPU cylce time we use Multithreading
			 */
		
			System.out.println("Start the thread....");
			
			Thread.sleep(1000);
			
			System.out.println("Thread after the NAP..");
			
			Thread t = Thread.currentThread(); //gives current thread details
			
			System.out.println(t.getName()); //thread name
			
			String name = Thread.currentThread().getName();
			System.out.println(name);
			System.out.println(t.getPriority());  //
			System.out.println();
			
			System.out.println(t);
			
	}
}
