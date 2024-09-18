package com.wrapper;

public class UtilityMethods {
public static void main(String[] args) {
		
	/*
	 * Utility methods also called as static methods
	 */
	
	//Constructor usage of wrapper class to create wrapper object
	Integer i1 = new Integer(10);
	Integer i2 = new Integer("100");
	
	System.out.println(i1);
	System.out.println(i2);
	
	
	//usage of utility methods to create wrapper object
	Integer i3 = Integer.valueOf(20); //int a =20; //AutoBoxing
	Integer i4 = Integer.valueOf("200");
	
	System.out.println(i3);
	System.out.println(i4);
	
	
	
	
}
}
