package com.staic;

public class Static_Non_Static {

	int a,b,c;
	static int m,n,l;
	
	{
		System.out.println("non static block");
		a=10;
		b=20;
		c=30;
		m=500;
		
	}
	Static_Non_Static(){
		//before executing constructor jvm will load the data here of non static block and execute them before const
		System.out.println("constructor");
	}
	
	static {
		System.out.println("static block");
		m=100;
		n=200;
		l=300;
	//	a=10;//cant use non static variable in static method as well.
	}
	
	void disp() {
		System.out.println("non static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m+" can access static variables here");
		System.out.println(n);
		System.out.println(l);
	}
	
	static void displ() {
		System.out.println("static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(l);
	    //System.out.println(a);//can not access non static variable in static method.
		//because for static members it will allocate mmeory in jvm at class loading time 
		//and for non static there is no memory allocated yet so it throws "compiler error"
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		Static_Non_Static.displ();
		System.out.println();
		
		Static_Non_Static en = new Static_Non_Static();
		en.disp();
		
	}
}
