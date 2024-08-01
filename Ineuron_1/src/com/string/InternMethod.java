package com.string;

public class InternMethod {
public static void main(String[] args) {
	
		
		
		String s2 = new String("Telusko"); //Heap+SCP
		
		String intern = s2.intern(); //It will copy the data from string object to SCP memory.
		
		System.out.println(intern);
				
}
}
