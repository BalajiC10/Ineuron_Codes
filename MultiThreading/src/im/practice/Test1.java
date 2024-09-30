package im.practice;

public class Test1 implements Runnable {
	
public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("main method");
		Test1 t = new Test1();
		Thread t1 = new Thread(t);
		t1.setPriority(10);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getPriority());
		System.out.println("MAIN METHOD ENDS");
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
	System.out.println("method");
}
}
