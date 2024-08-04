package com.poly;

public class MethodOverloading {

	//same class same method but diff parameter
	
	void show() {
		System.out.println("show1");
	}
	
	void show(int a) {
		System.out.println("show2");
		System.out.println(a);
		
	}
	
	void show(int a, String name) {
		
		System.out.println("show3");
		System.out.println(a);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.show();
	}
	
}
