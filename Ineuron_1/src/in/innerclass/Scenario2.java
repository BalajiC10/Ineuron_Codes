package in.innerclass;

import in.innerclass.Scenario1.Inner6;

public class Scenario2 {
	/*
	 * =>   Within the inner class "this" always refers current inner class object. 
	 *      To refer current outer class object we have to use "outer class name.this".
	 */
	
	int x =10;	
	class Inner7{
		int x=100;
		public void m1() {
			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Scenario2.this.x);
			
		}
	}
	
	public static void main(String[] args) {
		
		new Scenario2().new Inner7().m1();
		
		/*
		 * Output
           ======
		   javac Outer
		   java Outer
		   1000
		   100
		   10
		 */
		
	}

}
