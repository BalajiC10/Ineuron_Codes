package in.innerclass;

class Outer1{
	
	class Inner{
		
		public static void main(String[] args) {
			
			/*
			 * Output: CE: can't declare static inside Inner class.
			 */
			
			System.out.println(""
					+ "=> Inside inner class we can't declare static members. "
					+ "Hence it is not possible to\r\n"
					+ "declare main() method and we can't invoke\r\n"
					+ "inner class directly from the command prompt."
					+ "");
		}
	}
}
public class RegularInnerClass1 {
public static void main(String[] args) {
	
}
}

