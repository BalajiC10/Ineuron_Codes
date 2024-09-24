package im.practice;

class Bathroom implements Runnable
{
	synchronized public void run() {
	/*
	 * Non Synchronised -->The phenomenon called racing conditon -->where all threads will execute simultaneously (can face dead lok situation)
	 * Synchronised     -->it is condition where only one thread will execute at a single time(it will block for every user).
	 * 				    -->it is applied for method and block in java.
	 * 
	 *  String 		    -->Non Synchronised Methods -->data inconsistancy -->not thread safe
	 *  StringBuffer    -->Synchronised Methods  	  -->data consistancy   -->thread safe
	 *  StringBuilder   -->Non Synchronised Methods -->data inconsistancy -->not thread safe
	 */
		
		try {
			System.out.println(Thread.currentThread().getName() +" has entered the Bathroom");
			
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName() +" is using the Bathroom");
			
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName() +" exited the Bathroom");

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronisedKeyword {

public static void main(String[] args) {
	
	Bathroom b1 = new Bathroom();
	
	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(b1);
	Thread t3 = new Thread(b1);
	
	t1.setName("Boy");
	t2.setName("Girl");
	t3.setName("Tiktoker");
	
	t1.start();
	t2.start();
	t3.start();
}	
}
