package com.abstract_;

interface cal1{
	
	public void add();
	
	//From java 8 we can declare method with body.
	
	default void demo() {
		
	}
}

class cal2{
	
	public int sub() {
		
		int a=10;
		int b=20;
		int c= a-b;
		return c;
	}
}

class cal3 extends cal2 implements cal1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
	
		int a=20;
		int b=20;
		
		int c=a+b;
		
		System.out.println(c);
	}
	
}

public class Launch2 {
	
	public static void main(String[] args) {
		cal3 cal = new cal3();
		cal.add();
		System.out.println(cal.sub());
	}
}
