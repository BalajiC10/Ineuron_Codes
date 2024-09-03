package com.Exception;

import java.util.Scanner;

public class Launch1 {
public static void main(String[] args) {
	
	try {
	//Here it will handle exception by user defined.
	
	System.out.println("Welcome to Division Operation App");
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the first Number: ");
	int a = scan.nextInt();
	
	System.out.println("Enter second number: ");
	int b = scan.nextInt();
	
	int c = a/b; //Here if we dont handle exception JVM will check weather user handled if not  
	//it wil create exception and it will throw it.
	
	//Risky code
	
	System.out.println("Result is: "+c);
	}
	
	catch(ArithmeticException e) {
		System.out.println("You can't divide num by zero");
	}
	
	catch(Exception e){
		System.out.println(e);     //It will print the exception name.
		System.out.println("Give Proper Input...");
		System.out.println("Thank you for using our Application...!");
	}
	
	
}
}
