package in.linkedlist;
import java.util.*;
public class Linkedlist1 {
public static void main(String[] args) {
	
		/*
		 * Linkedlist: 	-it follows doubly linkedlist datastructure 
		 * 				-it implements list and queue interface both
		 * 				-can store hetero and homo geneous data (heap area)
		 * 				-Dispered memory allocation
		 * 				-index based adding element is recommanded here
		 * 				-can add front end an last end directly
		 * 				-order of insertion
		 * 				-duplicate allowed
		 */
	
	LinkedList l1 = new LinkedList();
	l1.add(10);
	l1.add("balaji");
	l1.add(true);
	l1.add(1, 'c'); //No shifting here it will link
	l1.addFirst("first"); //difference in methods compare to arraylist		
	l1.addLast("last");
	System.out.println(l1);
	
	LinkedList l2 = new LinkedList();
	l2.add("India");
	l2.offer("Bengaluru"); //it may add or not add
	l2.add(null);
	System.out.println(l2);
	
	
	
}
}
