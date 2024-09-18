package com.wrapper;

public class valueOf {
public static void main(String[] args) {
	
		/*
		 * valueOf() -->It is used to create wrapper object from given primitive or string of data.
		 * 			 -->It is alternative to constructor and good practice is to use valueOf() method.
		 */
	
		Integer i1 = Integer.valueOf(10);
		
		Double i2 = Double.valueOf(2.0);
		
		Short s1 = Short.valueOf((short) 1);
		
		Boolean b1 = Boolean.valueOf("Truw");
		
		Character c1 = Character.valueOf('c');
		
		
		System.out.println(c1);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(s1);
		System.out.println(b1);
		
		Integer i5 = Integer.valueOf("0");
	//	Character i6 = Character.valueOf(z); //CE
		
		Double d1 = Double.valueOf("10.20");
		System.out.println(d1);
}
}
