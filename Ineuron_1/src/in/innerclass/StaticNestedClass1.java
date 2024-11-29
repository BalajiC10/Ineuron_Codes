package in.innerclass;

public class StaticNestedClass1 {
	int x=10;
	static int y=20;
	
	static class Nested1{
	
		public void m1() {
			//System.out.println(x);//C.E:non-static variable x cannot be

			//reference from a static context
			System.out.println(y); //only static members allowed
		}
		
	}
public static void main(String[] args) {
	
/*
 *  
			 * => From the normal inner class we can access both static and non static members of
				  outer class but from static nested class we can access only static members of outer class.
 */
	/*
	 * (Test.class, Test$Nested.class)
	 */
}
}
