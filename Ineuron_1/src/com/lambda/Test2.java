package com.lambda;

interface Phone{ //Phone.class
	
	void disp();
}
public class Test2 { //Test2.class

	public static void main(String[] args) {
		
		Phone p = () -> System.out.println("Phone is Displayed"); //Test2.$.class
		p.disp();
	}
}
