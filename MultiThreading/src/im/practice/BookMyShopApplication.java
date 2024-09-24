package im.practice;

class Booking implements Runnable{
	
	

	int ticket = 2;
	@Override
    public void run() {

		try {
			System.out.println("Available Tickets: "+ticket);
			
			System.out.println(Thread.currentThread().getName()+" is ready to book one ticket");
		
			Thread.sleep(2000);
			
			if(ticket!=0) {	
				System.out.println(Thread.currentThread().getName()+" is booking ticket");
				Thread.sleep(2000);
				ticket--;
				
				System.out.println(Thread.currentThread().getName()+"'s booking is completed");
				Thread.sleep(2000);
			}
			else {
				System.out.println("Sorry...tickets all tickets are booked");
			}
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("Thanks for using our application");
		}
		System.out.println();
		
	}
	
}

public class BookMyShopApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b1 = new Booking();
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		
		t1.setName("Balaji");
		t2.setName("Sarish");
		t3.setName("Vasu");
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
