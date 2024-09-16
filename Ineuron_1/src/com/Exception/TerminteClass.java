package com.Exception;
class Beta10{
	
	void show() {
		
		try {
			
			System.out.println("Inside the show method");
			System.exit(0); //System exit will dominate Finally Block
		}
		finally {
			//Finally Block dominates return keyword
			System.out.println("Inside finally block");
		}
	}
}

public class TerminteClass {

	public static void main(String[] args) {
		
			Beta10 b = new Beta10();
			b.show();
	}
}
