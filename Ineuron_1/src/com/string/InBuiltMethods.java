package com.string;

public class InBuiltMethods {
public static void main(String[] args) {
	
		//
		String s1 = "RajaRamMohanRoa";
		
		System.out.println(s1.toLowerCase());//output will be in heap area
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.substring(0,3));
		
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.endsWith("a"));
		
		System.out.println(s1.length());
		System.out.println();
		
}
}
