package com.inherit;

public class MainClass {

	public static void main(String[] args) {
		
		SubClass sb = new SubClass();
		
		sb.value();
		System.out.println("We can access all object methods because of every class by-defult extends Object class");
		
		System.out.println("As In this case only Super class extends Object class and remaining classes Extends Super Class");
		
		System.out.println("This means Multiple Inheritance works Here...");
	}
}
