package in.innerclass;

public class Scenario1 {
	/*
	 * =>From inner class we can access all members of outer class (both static and non-
		 static, private and non private methods and variables) directly.
	 */
	
	int x =10;
	static int y=20;
	
	class Inner6{
		
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		
		new Scenario1().new Inner6().m1();
		
		/*
		 * javac Outer
			java Outer
			10
			20
		 */
		
	}

}
