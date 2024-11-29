package com.demo;

public class Demo1 implements Cloneable{
	int i=10;
	int j=20;
	
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		
		Demo1 d2;
		try {
			d2 = (Demo1)d1.clone();
			d2.i = 111;
			d2.j = 222;
			
			System.out.println(d1.i+"===>"+d1.j);
			System.out.println(d2.i+"===>"+d2.j);
			
			System.out.println(d1.hashCode() == d2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		

	}

}
