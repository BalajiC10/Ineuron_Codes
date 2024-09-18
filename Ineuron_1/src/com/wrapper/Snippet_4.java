package com.wrapper;

public class Snippet_4 {
public static void main(String[] args) {
	
	 Integer x = 10;
	 Integer y = 10;
	 
	 System.out.println(x==y); //true
	 
	 Integer a = 100;
	 Integer b = 100;
	 
	 System.out.println(a==b);
	 
	 Integer u = 1000;   
	 Integer v = 1000; //this will not come under byte buffer range (-128 to 127)
	 /*
	  * Note:
		byte,short,int,long,float,double the buffer concpet which internally jvm
		maintains is "byte range only".
		character -> 0 to 127
		Boolean -> always(true or false)
	  */
	 
	 System.out.println(u==v);
	 
	 Integer h = 127;
	 Integer i = 127;
	 
	 System.out.println(h==i);
}
}
