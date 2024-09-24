package im.practice;
class Demo0 implements Runnable{

	  public void run() {
		/*
		 * Join() Method --> You are decide the which thread to run first. -->it is not good practice.
		 * Synchronized  --> TS (Thread Schedule ) will schedule the which thread to execute
		 * 
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
public class DiffBW_JoinAndSynchronized {
public static void main(String[] args) {
	System.out.println("Main Thread");
	Demo0 d1 = new Demo0();
	Demo0 d2 = new Demo0();
	Demo0 d3 = new Demo0();
	
	try {
		Thread t1 = new Thread(d1);
		t1.setName("Boy");
		t1.start();
		t1.join(); //this will complete first then other will start -- but it is not good practice
		
		System.out.println();
		
		Thread t2 = new Thread(d2);
		t2.setName("Girl");
		t2.start();
		t2.join();
		
		System.out.println();

		Thread t3 = new Thread(d3);
		t3.setName("Techie");
		t3.start();
		t3.join();
		
		System.out.println();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}
