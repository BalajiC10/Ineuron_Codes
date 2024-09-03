package com.Exception;

import java.util.Scanner;



class Alpha1 {

	public void division() {
		try {
			
		
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
		catch(ArithmeticException e) {
			System.out.println("Give non zero input for second number");
		}
		
		catch(Exception e) {
			System.out.println("Generic catch block");
		}
	}
	
	
}
class Beta{

public void display() {
	Alpha1 a = new Alpha1();
	a.division();
	
}
}
public class Launch3{
	public static void main(String[] args) {
		Beta b = new Beta();
		b.display();
		//If exception trigered by default flow will from division->display->main method
	}
	
}

