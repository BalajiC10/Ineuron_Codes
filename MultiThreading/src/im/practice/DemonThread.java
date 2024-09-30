package im.practice;
class Ineuron implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		 * Demon Thred -> it may or may not execute the thread and 
		 *             -> it can be used in garbage collector and used for low priority work
		 * 
		 */
		try {
		for(int i=0;i<4;i++) {
			System.out.println("java is best to understand");
			Thread.sleep(2000);
				
		}		
				
		} catch (InterruptedException e) {
				System.out.println("Some interuption");
				
			
		}
	}
	
	
	
}
public class DemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = Thread.currentThread();
		
		System.out.println(t1.isDaemon());
		
		Ineuron i = new Ineuron();
		Thread t2 = new Thread(i);
		
		System.out.println(t2.isDaemon());
		t2.setDaemon(true); //You must set the daemon status before calling start() on a thread.
		t2.start();
		
		//t1.setDaemon(true); //throws illegalThreadxceptiion
		
		System.out.println(t2.isDaemon());
	}

}
