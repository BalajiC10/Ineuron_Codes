package in.innerclass;

class Outer{
	
	class Inner{
		
		public void m1() {
			System.out.println("Innner class Method");
			/*
			 * Output:
				javac Outer.java
				Outer.class
				Outer$Inner.class
			 */
		}
	}
}
public class RegularInnerClass {
	
	/*
	 * java Outer
	   NoSuchMethodError/main method not found
	   java Outer$Inner
       NoSuchMethodError/main method not found
	 */
}
