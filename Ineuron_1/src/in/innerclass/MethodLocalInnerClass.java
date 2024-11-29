package in.innerclass;


class Outer10{
	/*
	 * Method local inner classes:
	   => Sometimes we can declare a class inside a method such type of inner classes are
	   called method local inner classes.
	   
	 */
	
	public void m1() {
		System.out.println("Inside Outer class m1 method");
		class inner10{
			/*
			 * => The main objective of method local inner class is to define method specific
			   repeatedly required functionality.
			   => Method Local inner classes are best suitable to meet nested method requirement.
			 */
			public void sum(int x, int y) {
				System.out.println("Inside inner class m1 method"+(x+y));
				/*
				 * => We can access method local inner class only within the method where we declared it.
				 */
			}
		}
		
		new inner10().sum(10, 20);
		
	}
}


public class MethodLocalInnerClass {
public static void main(String[] args) {
	
		new Outer10().m1();
		
}
}
