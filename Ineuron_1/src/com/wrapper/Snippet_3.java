package com.wrapper;

public class Snippet_3 {
public static void main(String[] args) {
	 
	Integer x = new Integer(10);
	Integer y = x; //Both are point to one object   ->true
	
	System.out.println(x==y);
	
	Integer a = new Integer(10);
	Integer b = 10; //Both are point to diff object ->false
	
	System.out.println(a==b);
}
}
