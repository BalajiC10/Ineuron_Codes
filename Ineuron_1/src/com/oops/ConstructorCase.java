package com.oops;

class Demo{
	int a,b,c;
	public Demo() {
		System.out.println("Parent Const");
		a=10;
		b=20;
		c=a+b;
		//System.out.println(c);
	}
	
	public Demo(int x , int y) {
		
		c=x+y;
		System.out.println("Parent param constructor");
		
	}
	
	public void disp(){
		System.out.println("Parent class");
	}
}
class Demo1 extends Demo{
	int m,n,o;
	public Demo1() {
		super(10,20);
		System.out.println("Child constructor");
		
		m=10;
		n=20;
		o=m+n;
		//System.out.println(o);
	}
	
	public Demo1(int x , int y) {
		this();
		o=m+n;
		System.out.println("Child param constructor");
	}
	
	public void disp(){
		System.out.println("Child class");
	}
}


public class ConstructorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 object = new Demo1();
		object.disp();
		//we should have one super in any one constructor compulsary
	}

}
