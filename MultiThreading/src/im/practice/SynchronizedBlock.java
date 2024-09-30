package im.practice;

class Alpha10 implements Runnable{
	
	public void run() {
			
		
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
			Thread.sleep(2000);
			
			synchronized(this) { //without this it will go in race condition phenomenon
				
			for(int j=0;j<5;j++) { //at time it will execute a-z for every single thread
				System.out.println((char)(j+65));
			}
			}
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Some Interuption");
		}
		
		
		
		
	}
}

public class SynchronizedBlock {
public static void main(String[] args) {
	
		Alpha10 a1 = new Alpha10();
		System.out.println("Main Method");
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);
			
		t1.start();
		t2.start();
		t3.start();
		System.out.println();
		
		
}
}
