package in.innerclass;

public class StaticNestedClass {

	static class Nested{
		
		public void method1() {
			
			System.out.println("nested class method");
			
			/*
			 * => Inside static nested classes we can declare static members including main() method also.
			 * => Hence it is possible to invoke static nested class directly from the command prompt.
			 * 
			 * 
			 * => From the normal inner class we can access both static and non static members of
				  outer class but from static nested class we can access only static members of outer class.
			 */
		}
		
		public static void main(String[] args) {
			System.out.println("Inner main method");
			
			StaticNestedClass.Nested st = new StaticNestedClass.Nested();
			st.method1();
			
			Nested td = new Nested();
			td.method1();
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Outer main method");
		
		/*
		 * java Test
		   outer class main method
		   java Test$Nested
           Nested class main method
		 */
	}
}
