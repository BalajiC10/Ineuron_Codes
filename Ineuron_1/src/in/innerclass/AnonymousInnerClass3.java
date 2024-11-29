package in.innerclass;

class pop{
	
	public void taste() {
		System.out.println("spicy");
	}
}

public class AnonymousInnerClass3 {

	public static void main(String[] args) {
			
		pop p = new pop() {
			
			public void taste() {
				methodone();//valid call (internal purpose)
				System.out.println("Salty");
			}
			
			public void methodone() {
				System.out.println("child specific method");
			}
		};
		//p.methodone(); here we cant call child specific method 
		p.taste(); //salty
		
		pop p2 = new pop();
		p2.taste(); //spicy
		
	}
}
