package com.inherit;

class X extends Object{
	
	public X() {
		//super() ; //it will be there on every const hidden
		System.out.println("In X-Constructor");
	}
	
	public X(int i) {
		System.out.println("In X int");
	}
	
	
}

class Y extends X{
	
	public Y() {
		System.out.println("In Y-Constructor");
	}
	public Y(int i) {
	//	super();//In case of this it will call super const i.e X-Constructor i.e in object class it is calling the constructor
		super(); //In case of this it will call super int method
		System.out.println("In Y int");
	}
	
	
}

public class Test1 {
	
	public static void main(String[] args) {
	Y obj = new Y(10);
		
	}
	
}

