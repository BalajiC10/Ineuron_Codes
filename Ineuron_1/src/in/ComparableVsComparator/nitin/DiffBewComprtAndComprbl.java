package in.ComparableVsComparator.nitin;

import java.util.Comparator;
import java.util.TreeSet;
 //Diff B/w the Comparator & Comparable

/*
 * Comparison of Comparable and Comparator:
		Comparable
			Present in java.lang Package
			It is Meant for Default Natural Sorting Order.
			Defines Only One Method compareTo()
			All Wrapper Classes and String Class implements Comparable Interface.
	Comparator
			Present in java.util Package
			It is Meant for Customized Sorting Order.
			Defines 2 Methods compare() and equals().
			The Only implemented Classes of Comparator are Collator and RuleBaseCollator.
 */
class demo1 implements Comparable{ //single logic sorting

	@Override
	public int compareTo(Object o) { //meant for DNSO (Default Natural Sorting Order)
		
		/*
		 * Rules: How method works internally
		 * returns +ve value if obj 1 will has to come before obj 2
		 * returns -ve value if obj 1 will has to come after obj 2
		 * returns   0 value if and only if obj1 and obj2 are equal.
		 * 
		 */
		return 0;
	}
	
}

class demo2 implements Comparator{ //(Multiple logic sorting)

	@Override
	public int compare(Object o1, Object o2) {
		// Write the logic as per the user requirements 
		
		/*
		 * Rules: How method works internally
		 * returns +ve value if obj 1 will has to come before obj 2
		 * returns -ve value if obj 1 will has to come after obj 2
		 * returns   0 value if and only if obj1 and obj2 are equal.
		 * 
		 */
		return 0;
	}
	
}

public class DiffBewComprtAndComprbl {
public static void main(String[] args) {
		
	
		
	    //JVM uses comparable compareTo() to sort the object added into TreeSet
		//Compulsory the object should implement the comparable interface-JDK 11.. if not it will throw ClassCastException
		TreeSet ts = new TreeSet(); //it sort internally by using interface comparable 
		ts.add("A");
		ts.add("D");
		ts.add("R");
		ts.add("F");
		ts.add("Z");
		//ts.add(10); // throws ClassCastException
		//Sorting happened bcoz string implements comparable , so JVM called compareTo()
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet(); //it sort internally by using interface comparable 
		ts1.add(new StringBuffer("A"));
		ts1.add(new StringBuffer("Z"));
		ts1.add(new StringBuffer("D"));
		ts1.add(new StringBuffer("F"));
		ts1.add(new StringBuffer("T"));
		
		//Sorting if it should happen then object should 
		System.out.println(ts1); //DNSO Default natural sorting order 
				
		TreeSet ts2 = new TreeSet(); //it sort internally by using interface comparable 
		ts2.add(new StringBuilder("S"));
		ts2.add(new StringBuilder("G"));
		ts2.add(new StringBuilder("A"));
		ts2.add(new StringBuilder("U"));
		ts2.add(new StringBuilder("P"));
		
		//Sorting if it should happen then object should 
		System.out.println(ts2); //DNSO Default natural sorting order 		
}
}
