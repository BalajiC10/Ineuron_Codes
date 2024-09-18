package com.wrapper;

public class xxxvalue {
public static void main(String[] args) {
	
	/* xxx->Primitive data
	 * xxxValue() -->we can use this xxxValue() to convert wrapper to primitive data.
	 * 			  -->Following 6 xxValue() method to convert wrapper into primitive.	
	 * 			  --> int , short , byte , double , float , long
	 * 	
	 */
	
		Integer i = new Integer(10);
		System.out.println(i.intValue());
		
		int p = i.intValue(); //Convert wrapper object to primitive
		
		double d = i.doubleValue();
		
		long l = i.longValue();
		
		float f = i.floatValue();
		
		short s = i.shortValue();
		
		byte b = i.byteValue();
		
//		Character c = i.charValue(); ///not existe except this all are there
				
		
		System.out.println(p);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
		System.out.println(s);
		System.out.println(b);
		
		
		
}
}
