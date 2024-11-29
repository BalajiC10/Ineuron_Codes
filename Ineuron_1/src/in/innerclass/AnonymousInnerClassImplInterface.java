package in.innerclass;

public class AnonymousInnerClassImplInterface {

		public static void main(String[] args) {
			
			Runnable r1 = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0;i<10; i++) {
						System.out.println("child thread");
					}
				}
				
				
			};
			Thread t = new Thread();
			t.start();
			
			for(int i=0;i<10; i++) {
				System.out.println("main thread");
			}
		}
}
