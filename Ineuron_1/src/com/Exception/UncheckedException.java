package com.Exception;

import java.util.Scanner;

class Alpha2 {

	public void division() throws ArithmeticException { //Ducking Exception
		
			
		
		System.out.println("Welcome to my Application...");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first the Number:");
		int fi = scan.nextInt();
		
		System.out.println("Enter the second Number: ");
		int sc = scan.nextInt();
		
		int res = fi/sc;
		
		System.out.println("the result is "+res);
		
		
		System.out.println("Thank you for using our Application...!");
		
		
	}
	
	
}
class Beta1{

public void display() {
	Alpha2 a = new Alpha2();
	a.division();
	
}
}
public class UncheckedException {
	public static void main(String[] args) {
		try {
		Beta1 b1 = new Beta1();
		b1.display();
		}
		catch(Exception e) {
			System.out.println("Handling in Exception main method");
		}
		//Three eays to ignore Exception:-
		//1.Handle using tr/catch block
		//2.Ducking the exception using throws keyword (abovee Example).
		//3.Rethrowing the exception using (try/catch, throws, throw keyword).
		
	}

}
