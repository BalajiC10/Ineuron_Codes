package in.innerclass;


interface OuterInt{
	
	public void methodone();
	
	interface Inner{
		
		public void methodTwo();
	}
}

class Test implements OuterInt.Inner{

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Method Two...");
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.methodTwo();
	}
	
}
class Test1 implements OuterInt{

	@Override
	public void methodone() {
		
		//Whenever we are implementing Outer interface , it is not required to implement Inner interfaces.
		
	System.out.println("Method one");	
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.methodone();
		
	}
	
	//i.e., Both Outer and Inner interfaces we can implement independently.
}


public class InterfaceInsideInterface {
	
	/*
	 * 3. interface inside a interface :
		  We can declare an interface inside another interface.
		  
		  Nested interfaces are always public,static whether we are declaring or not. Hence
		  we can implements inner inteface directly with out implementing OuterInt interface.
	 */
	
	interface Entry{
		
		public Object getKey();
		public Object getValue();
		public Object setValue(Object newValue);
	}
}
