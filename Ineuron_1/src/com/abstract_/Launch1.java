package com.abstract_;

abstract class xyz{
	//Abstract : Incomplete class
	//we can apply only to class and method.
	//if we keep one abstract method in class we must declare class as abstract
	//we cannot declare abstract variable.
	//abstract method have method signature without body
	//abstract method can be implemented in child class.
	//we cannot create object of abstract class and we can give reference to child object.
	//(to promote poly and loose coupling)
	
	
	public abstract int add();
	
	public abstract int add(int a,int b);
	
}

class xyx extends xyz{

	@Override
	public int add() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}

	@Override
	public int add(int a,int b) {
		
		int c=a+b;
		return c;
		
	}	
	
}


public class Launch1 {

	public static void main(String[] args) {
		xyz obj = new xyx();
		System.out.println(obj.add());
		System.out.println(obj.add(10,20));
	}
	
	
	
}
