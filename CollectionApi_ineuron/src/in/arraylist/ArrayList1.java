package in.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
		
	/*
	 * Arraylist :- Dynamic array means index is not fixed/ follows dynamic array DS
	 * 			   -followes insertion order
	 * 			   -implements list interface
	 * 			   -duplicates are allowed
	 * 			   -demands contigous memory
	 * 			   -null values allows
	 */
	

	ArrayList a1 = new  ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(1, 30);
	a1.add(null);
	System.out.println(a1.get(1));
	
	System.out.println(a1);
}
}
