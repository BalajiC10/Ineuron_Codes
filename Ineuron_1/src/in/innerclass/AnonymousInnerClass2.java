package in.innerclass;

/*
 * Note:
	Inside Anonymous inner classes we can take or declare new methods but outside of
	anonymous inner classes we can't call these methods directly because we are
	depending on parent reference.[parent reference can be used to hold child class
	object but by using that reference we can't call child specific methods]. These
	methods just for internal purpose only.
 */

class Popcorn{
	
	
	public void taste() {
		System.out.println("spicy");
	}
}

public class AnonymousInnerClass2 {

	public static void main(String[] args) {
		// 1. Anonymous inner class that extends a class.
		/*
		 *  We are creating child class without name for the PopCorn class and for that
			child class we are creating an object
			with Parent PopCorn reference. below
			1. We are creating child class for PopCorn without name.
			2. We are overriding taste() method.
			3. We are creating object for that child class with parent reference.
		 */
		
		Popcorn p = new Popcorn() { 
			
			@Override
			public void taste() {
				System.out.println("tangi");
			}
		};
		p.taste();//salty
		
		
		
		Popcorn p1=new Popcorn();
		p1.taste();//spicy
		
		/*
		 * So, a total of three class files will be created:

			Popcorn.class
			AnonymousInnerClass2.class
			AnonymousInnerClass2$1.class
		 */
		
		

	}

}
