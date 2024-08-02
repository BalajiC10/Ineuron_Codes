package com.statick;

public class MemoryAllocation {
	//static members will get stored in heap memory only once and can use in all objects which will be created in class.
	//static members belongs to class so that it saves memory by storing only once and increases perform of appl
	
	 
	int a,b,c;        // 4.it will initilize 0 values to this instance variables with respect to object.
	static int x,y,z; // 1.first of all static variable will get allocated in heap memory.
	
	{
		System.out.println("Non-static Block"); // 5. this values get stores inside the object.
		a=10;
		b=20;
		c=30;
		
	}
	
	public MemoryAllocation() {
		System.out.println("Constructor");
	}
	
	public void disp() {
		System.out.println("Non-static Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("we can use static members in non static variable "+x);
	}
	
	static {
		
		System.out.println("Static Block");//2.here it will assign values to a,b,c.
		System.out.println("JVM will allocate memory when .class file is loading");
		System.out.println("We cant keep non static member in static block or method");
		x=100;
		y=200;
		z=300;
		
	}
	public static void displ() {
		System.out.println("static method");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		MemoryAllocation.displ(); 
		
		MemoryAllocation en = new MemoryAllocation();//3.it will create one record bar 
		en.disp();
	}
	
	
}
