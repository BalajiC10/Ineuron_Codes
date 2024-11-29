package in.innerclass;


class Outer5{
	
	/*
	 * Accessing inner class code from outside of outer class
	 */

class Inner4{
	
	public void m1() {
		System.out.println("Inner class Method ");
	}
}

}
public class RegularInnerClass4 {
public static void main(String[] args) {
	
		Outer5 o = new Outer5();
		Outer5.Inner4 i =  o.new Inner4();
		
		i.m1();
		
		/*
		 * Output
			=====
			javac Test
			java Test
			inner class instance m1()
		 */
}
	
}
