package in.generics;

public class Box<T> {
	
	T container;
	
	public Box(T container ) {
		this.container=container;
	}
	
	public Object getValue() {
		return this.container;
	}
	
	public void task() {
		
		if(container instanceof String) {
			System.out.println("The Length of "+ container +" is "+ (((String)this.container).length()));
			
		}
		else if(container instanceof Integer) {
			System.out.println("This is the integer value "+ container);
		}
		
		
	}
		
}
