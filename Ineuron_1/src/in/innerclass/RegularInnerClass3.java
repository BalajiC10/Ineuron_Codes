package in.innerclass;

public class RegularInnerClass3 {
	
	/*
	 * Accessing inner class code from instance area of outer class
	 */
	class Inner3{
		
		public void m1() {
			System.out.println("Inner class Method....	");
		}
		
	
	}
	public void m2() {
		Inner3 in = new Inner3();
		in.m1();
	}
	public static void main(String[] args) {
		
		System.out.println("Outer main Method...");
		RegularInnerClass3 r1 = new RegularInnerClass3();
		r1.m2();
		
		/*
		 * javac Outer
		   java Outer
		   inner class instance m1()
		 */
		
	}
	
}
