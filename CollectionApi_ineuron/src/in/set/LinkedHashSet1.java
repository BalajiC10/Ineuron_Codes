package in.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * internally follows hashtable (HashFunction)
		 * Searching ops is faster than any collection
		 * added from jdk 1.4
		 * follows insertion order
		 */
		
		HashSet s1 = new HashSet();
		s1.add(20);
		s1.add(10);
		s1.add(30);
		s1.add(5);
		
		if(s1.contains(30)) {
			System.out.println("30 is present");
		}
		
		System.out.println(s1);
		
		LinkedHashSet s2 = new LinkedHashSet();
		s2.add(20);
		s2.add(5);
		s2.add(60);
		s2.add(40);
		s2.add(50);
		
		
		System.out.println(s2);
	}

}
