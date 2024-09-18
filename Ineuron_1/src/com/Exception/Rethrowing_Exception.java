package com.Exception;

import java.util.*;

class Test1{

	public void division()  throws Exception{
		
		try {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		
		System.out.println("Enter second number to divide: ");
		int b = scan.nextInt();
		
		int res = a/b;
		
		System.out.println("result is "+res);
		
		}
		
		catch(Exception e) {
			
			System.out.println("Method is handling the exception");
			throw e; //Rethrowing the Exception :- Telling caller this method throws exception so handle urself
			
		}
		finally {
			System.out.println("Final Keyword");
			System.out.println("Throw key is like return keyword -->Nothing will execute below throw keyword");
			System.out.println("Thank you for using our Application");
			
		}
		
		
	}
	
}

public class Rethrowing_Exception {
public static void main(String[] args) {
	
		try {
			Test1 t = new Test1();
			t.division(); 
			
		}
		catch(Exception e) {
			System.out.println("Main method is handling the Exception");
		}
		
}
}
