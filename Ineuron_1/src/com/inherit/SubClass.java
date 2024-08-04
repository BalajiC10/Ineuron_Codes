package com.inherit;

public class SubClass extends SuperClass{
	int i=7;
	public void show() {
		System.out.println("show subclass");
	}
		
	public void value() {
		int i=9;
		System.out.println("Inside method value: "+i);
		System.out.println("Current class instance Value: "+this.i);
		System.out.println("Super class instance value:"+super.i);
	}
}
