package com.inherit;

class A{
	
	public A() {
		System.out.println("A Constructor");
	}
}

class B extends A{
	public B() {
		System.out.println("B Constructor");
	}
}

class C extends A{
	
	public C() {
		System.out.println("C Constructor");
	}
}
public class HeirarchyType {

	public static void main(String[] args) {
		
		C obj = new C();
		//It will print A class Const and C class Cons
		//because super() keyword will be there in C class which calls super class cons then current cons
	}
}
