package com.inherit;

class A1{
	
	A1(){
		System.out.println("Const 1");
	}
	void show() {
		System.out.println("A");
		
	}
	
}

class B1 extends A1{
	
	B1(){
		System.out.println("Const 2");
	}
	
	int show() {
		
		System.out.println("B");
		
		return a;
	}
}

public class Test2 {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show();
	}
}
