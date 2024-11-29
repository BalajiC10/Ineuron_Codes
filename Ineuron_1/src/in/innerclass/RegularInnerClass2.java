package in.innerclass;


public class RegularInnerClass2 {
	/*
	 * Accessing inner class code from static area of outer class:
	 */
	class Inner2{
		
		public void m1() {
			System.out.println("inner class method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer main method...");
		RegularInnerClass2 outer = new RegularInnerClass2();
		
		//Scenario-1
		RegularInnerClass2.Inner2 inner =  outer.new Inner2();
		inner.m1();
		
		//Scenario-2
		new RegularInnerClass2().new Inner2().m1();
				
		/*
		 * Output
			=====
			javac Outer
			java Outer
			inner class instance m1()
		 */
	}
}
