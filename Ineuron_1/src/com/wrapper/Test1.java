package com.wrapper;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(10);
		System.out.println(i);
		
		Integer i1 = new Integer("100");
		System.out.println(i1);
		
		
		Long l2 = new Long(100000000);
		Long l3 = new Long("2000000000000");
		
		System.out.println(l2);
		System.out.println(l3);
		
		Float b = new Float(1.0f);
		System.out.println(b);
		
		Float b1 = new Float("2.0f");
		System.out.println(b1);
		
		Short s = new Short((short) 10);
		System.out.println(s);
		Short s1 = new Short("10");
		System.out.println(s1);
		
		
		Boolean bl = new Boolean(true);
		System.out.println(bl);
		Boolean b2 = new Boolean(false);
		System.out.println(b2);
		
		Boolean b3 = new Boolean("true");
		System.out.println(b3);
		Boolean b5 = new Boolean("TrUe");
		System.out.println(b5);
		
		Boolean b4 = new Boolean("ijas");
		System.out.println(b4);
		
		
		Character ch = new Character('a');
		System.out.println(ch);
		Character ch1 = new Character('A');
		System.out.println(ch1);
		
		
	}

}
