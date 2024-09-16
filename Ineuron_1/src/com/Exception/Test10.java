package com.Exception;

class Test2{
	
	public void show1() {
		
		try {
			
			int res =10/0;
			System.out.println(res);
			System.out.println("try block");
		}
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally block");
		}
	}
}

public class Test10 {

	public static void main(String[] args) {
		Test2 t= new Test2();
		t.show1();
	}
	
}
