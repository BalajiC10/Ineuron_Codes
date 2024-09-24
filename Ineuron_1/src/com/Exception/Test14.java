package com.Exception;

class Demo34{
	
	public void divide(int n) {
		
		System.out.println(n/0);
		
	}
}

public class Test14 {

	public static void main(String[] args) throws Exception {
		
		Demo34 d = new Demo34();
		d.divide(10);
	}
}
