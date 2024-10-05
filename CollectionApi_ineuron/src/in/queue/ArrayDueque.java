package in.queue;

import java.util.ArrayDeque;

public class ArrayDueque {

	public static void main(String[] args) {
		/*
		 * it is class in java to store data 
		 * it implements D-Queue interface (queue-->Dqueue) sub interface
		 * order of insertion maintance
		 * duplicates allowed
		 * null values not inserted
		 * first and last element can be added
		 * index based 	adding not allowed
		 */
		
		ArrayDeque a1= new ArrayDeque();
		a1.add(100);
		a1.add("balaji");
		a1.add(false);
		a1.addFirst(100);
		a1.addLast(200);
		
		
		System.out.println(a1);
		
	}

}
