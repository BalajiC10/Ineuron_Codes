package in.ComparableVsComparator.nitin;

public class CompareToMethod {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z")); //-ve value
		System.out.println("Z".compareTo("A")); //+v value
			
		System.out.println("A".compareTo("A")); //0 value
		System.out.println("A".compareTo(null)); //NullPointerException
		
		

	}

}
