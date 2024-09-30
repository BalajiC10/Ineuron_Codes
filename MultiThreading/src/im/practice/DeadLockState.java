package im.practice;

class Warrior implements Runnable{
	
	String res1 = new String("Bramhastra");
	String res2 = new String("Pashupatra");
	String res3 = new String("Sarpastra");
	
	/*
	 * Dead lock ->it is phenomenon where multiple threads will be stuck in dead state due to 
	 * 			 ->there resources are mutually dependant on each other.
	 * 			 ->at this stage program will stop permanantly.
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String s1 = Thread.currentThread().getName();
		
		if(s1.equals("Rama")) {
			ramaAcqRes();
		}
		else{
			ravanAcqRes();
			
		}
		
	}
	

	public 	void ramaAcqRes() {
		
		try {
			Thread.sleep(2000);
			
			synchronized(res1) {
					
				System.out.println("Rama has Acquired "+res1);
				
				Thread.sleep(2000);
				
				synchronized(res2) {
					
					System.out.println("Rama has Acquired "+res2);
					Thread.sleep(2000);
					
					synchronized(res3) {
						
						System.out.println("Rama has Acquire "+res3);
						
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Some interuption");
		}
	}
	
public 	void ravanAcqRes() {
		
		try {
			Thread.sleep(2000);
			
			synchronized(res3) {
					
				System.out.println("Ravana has Acquired "+res3);
				
				Thread.sleep(2000);
				
				synchronized(res2) {
					
					System.out.println("Ravana has Acquired "+res2);
					Thread.sleep(2000);
					
					synchronized(res1) {
						
						System.out.println("Ravana has Acquire "+res1);
						
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Some interuption");
		}
	}
}
public class DeadLockState {

	public static void main(String[] args) {
		
		System.out.println("Main Method started...");
		Warrior w= new Warrior();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		
		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();
		System.out.println("Main Method ended...");
	}
}
