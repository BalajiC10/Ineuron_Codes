package com.inherit;
class Aa{
	
	Aa(){
		System.out.println("Constructor");
	}
	
	static void show() {
		System.out.println("static method");
		System.out.println("static methods can be overloaded but not overridden");
		System.out.println("");
	}
	
	static void show(int n) {
		System.out.println("static param method");
		System.out.println("They cannot be overridden because they act on the class itself, not an object.");
	}
	
	{
		System.out.println("Non static Blocks");
	}
}

class Ba extends Aa{
	
	
	
}
public class StaticMethods {

	public static void main(String[] args) {
		System.out.println("Main method");
		Ba obj = new Ba();
//		System.out.println(obj.show());
	}
}
