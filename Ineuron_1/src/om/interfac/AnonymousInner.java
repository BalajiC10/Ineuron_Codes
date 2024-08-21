package om.interfac;

interface Alpha1{
	
	void show();
}

//Another way to implement the interface and it called anonymous inner class
public class AnonymousInner {

	public static void main(String[] args) {
		
			Alpha1 obj = new Alpha1() {

				@Override
				public void show() {
				
					System.out.println("Beta Implemented Method");
					
				}
				
				
				};
			obj.show();
					
			
	}
}
