package im.practice;

class Demo1 extends Thread{
	/*
	 * Thread created using two ways:--> 1.Extends Thread class 2.Implements Runnable Interface.
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
class Demo2 extends Thread{
	
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
class Demo3 extends Thread{
	
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
public class LaunchMT1 {
	
	public static void main(String[] args) {
		Demo1 d1 =new Demo1(); //As demo extended Thread class so it aquired all properties of thread
		Demo2 d2 =new Demo2(); //and we can use thread methods directly as below --> start().
		Demo3 d3 =new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
	}
}
