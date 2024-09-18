package com.wrapper;

public class parseXXX {

	public static void main(String[] args) {
		
		/*
		 * Every Wrapper class except Character contains parseXXX() to convert String to Primitive
		 */
		
		int l1 = Integer.parseInt("10");
		System.out.println(l1);
		
	//	short s1 = Short.toString("Ten");
	//	System.out.println(s1); //NumberFormateException
		
		double d1 = Double.parseDouble("13");
		System.out.println(d1);
		
		byte b1 = Byte.parseByte("09");
		System.out.println(b1);
		
		long l2 = Long.parseLong("029390");
		System.out.println(l2);
		
		boolean b2 = Boolean.parseBoolean("sds");
		System.out.println(b2);
		
	}
}
