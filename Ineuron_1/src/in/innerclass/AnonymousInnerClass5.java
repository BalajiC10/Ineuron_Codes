package in.innerclass;

public class AnonymousInnerClass5 {
	//Anonymous Inner Class that define inside method arguments
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10; i++) {
					System.out.println("child thread");
				}
			}
			
		}).start();
		
		for(int i=0;i<10; i++) {
			System.out.println("main thread");
		}
	}
}
