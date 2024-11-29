package in.innerclass;


class A2{
	
	/*
	 * => If we are declaring inner class inside instance method then we can access both
		static and non static members of outer class directly.
		=> But if we are declaring inner class inside static method then we can access only
		static members of outer class directly and
		we can't access instance members directly.
	 */
	static int a1=20;
	int a2=30;
	public void a1() {
		
	
	class B2{
		
		static int b=10;
		int b1=100;
		
		public void m1() {
			System.out.println("Nested Inner class method");
			System.out.println(a1);
			System.out.println(a2);
		}
		public static void main(String[] args) {
			System.out.println("main Inner class");
		}
	}
	
	/*
	 * case2:
if we declare in outer class  static method then it would result in CE.
	 */
	
	B2 a = new B2();
	a.m1();
	
}
}

public class MethodLocalInnerClass1 {
public static void main(String[] args) {
	
	A2 a = new A2();
	a.a1();
}
}
