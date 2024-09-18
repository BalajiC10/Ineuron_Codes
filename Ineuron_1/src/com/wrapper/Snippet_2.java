package com.wrapper;

public class Snippet_2 {
public static void main(String[] args) {
	
		Integer i1 = new Integer("10");
		Integer i2 = new Integer("10");
		
		System.out.println(i1==i2); //Both will have diff object and address to point ->false
		
		Integer i3 = new Integer("10");
		Integer i4 = new Integer(10);
		
		System.out.println(i3==i4); //Both will have diff object and address to point ->false
}
}
