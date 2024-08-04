package com.inherit;

class Parent{
	
	public Parent(){
		System.out.println("Parent Constructor");
	}
	//Constructor can be overloaded and can not be overridden.
	public Parent(int n) {
		System.out.println("Parent Param");
	}
	
	public void show() {
		System.out.println("Parent show");
	}
}

class Child extends Parent{
	
	public Child(){
		super();
		System.out.println("Child Constructor");
	}
	public Child(int n) {
		this();
		System.out.println("Child param");
	}
	
	public void show() {
		
	 System.out.println("Child show");
	 
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		Child d = new Child();
		d.show();
	}
	
	
}
