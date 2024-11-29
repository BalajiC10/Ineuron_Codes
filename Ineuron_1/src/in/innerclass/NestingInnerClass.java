package in.innerclass;


class A1{
	
	class B1{
		
		class C1{
			
			public void m1()
			{
				System.out.println("Inside C class method");
			}
		}
		
	}
}

public class NestingInnerClass {
	
	/*
	 * Nesting of Inner classes :
	   We can declare an inner class inside another inner class
	 */
	public static void main(String[] args) {
		
		//Scenario-1
		A1 a = new A1();
		A1.B1 b = a.new B1();
		
		A1.B1.C1 c = b.new C1();
		
		c.m1();
		
		//Scenario-2
		new A1().new B1().new C1().m1();
		
	}		
}
