package com.basics;

public class IFandElse {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		int c=5;
		
		if(a>b && a>c) {
			System.out.println("a: "+a);
		}
		else if(b>c) {
			System.out.println("b: "+b);
		}
		else {
			System.out.println("c: "+c);
		}
	}
}
