package im.practice;

class Demo4 implements Runnable{
	/*
	 * Thread created using two ways:--> Implements Runnable Interface.
	 * 								 --> run() method means created thread and 
	 * 								 --> start() gave life to thread or started thread.
	 * 								 -->Thread.sleep() throws interuptionException so try/catch handles them
	 * 
	 */
	public void run() {
		System.out.println("Banking task started");
		
		for(int i=0;i<3;i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			System.out.println("Banking.....");
			
			
		}
		System.out.println("Banking is completed...");
	}
}
class Demo5 implements Runnable{
	
	public void run() {
		System.out.println("Printing activity started");
		
		for(int i=0;i<3;i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			System.out.println("Printing.....");
			
			
		}
		System.out.println("Printing is completed...");
	}
}
class Demo6 implements Runnable{
	
	public void run() {
		System.out.println("Calculation task started");
		
		for(int i=0;i<3;i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			System.out.println("Calculation.....");
			
			
		}
		System.out.println("Calculation is completed...");
	}
}

public class LaunchMT2 {

	public static void main(String[] args) {
		Demo4 d4 = new Demo4();
		Demo5 d5 = new Demo5();
		Demo6 d6 = new Demo6();
		
		Thread t1 = new Thread(d4);
		Thread t2 = new Thread(d5);
		Thread t3 = new Thread(d6);
		
		
		
	}
}
