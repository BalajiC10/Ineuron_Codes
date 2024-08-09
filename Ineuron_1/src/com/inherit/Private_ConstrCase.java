package com.inherit;
class P{
	
	public int age;
	private String name;//Here we cant access name variable as its private so it will not be inherits in child class
	
	P(){
		System.out.println("Parent Constructor will executes First");
		System.out.println("Constructor cant be overridden");
	}
	
	
}

class Ch extends P{
	
	Ch(){
		//Parent Constructor will executes First because here super keyword will be there that calls parent cons first
	 
		System.out.println("Child Constructor");
	}
}

public class Private_ConstrCase {
public static void main(String[] args) {
	Ch obj = new Ch();
	System.out.println(obj.age);
	
	
}
}
