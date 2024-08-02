package com.statick;

public class BelongsToClass {
	public static int a,b,c;
	//it will allocate the variables and static members at .class file loading time.
	//so all static members belongs to class rather than the object.
	//flow->static variables ->static block ->main method -> static methods
	
	static {
		System.out.println("static block");
		a=10;
		b=20;
		c=30;
	}
	
	static void disp() {
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
public static void main(String[] args) {
	
	System.out.println("main method");
	BelongsToClass.disp();
		
}
}
