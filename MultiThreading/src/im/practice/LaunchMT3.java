package im.practice;

class Alpha extends Thread{
	/*
	 * Achive Multithreading using single run method.
	 * 
	 * 
	 */
	public void run() {
		
		String t = Thread.currentThread().getName();
		
		if(t.equals("Bank")) {
			Banking();
		}
		else if(t.equals("Print")) {
			Printing();
		}
		else {
			Calc();
		}
	}
	public void Banking() {
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
	
	public void Printing() {
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
	
	public void Calc() {
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

public class LaunchMT3 {
public static void main(String[] args) {
		
		System.out.println("Main method is started..");
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		a1.setName("Bank");
		a2.setName("Print");
		a3.setName("Calc");
		
		System.out.println(a1.isAlive()); //its before start so not alive -->false
		System.out.println(a2.isAlive());
		System.out.println(a3.isAlive());
		
		a1.start(); //Once we give start its ThreadScheduler Work to run threads which will handle by JVM.
		System.out.println(a1.isAlive()); //thread started so its alive noe -->true
		a2.start();
		a3.start();
		
		try {
			a1.join(); //untill a1 should completed main method will not complete	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
		System.out.println("Main method is Completed..");
}
}
