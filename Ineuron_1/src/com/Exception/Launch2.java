package com.Exception;

import java.util.Scanner;

public class Launch2 {
public static void main(String[] args) {
	
	
		try {
			
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter size of array: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements for an array: ");
		int ele = scan.nextInt();
		
		System.out.println("Enter the position for element to store: ");
		int pos=scan.nextInt();
		arr[pos]=ele;
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("can have multiplee catch blocks for one try block");
			System.out.println("Give Input within array size");
		}
		
		catch( Exception e) {
			System.out.println("Should Keep Exception catch block in end..");
			System.out.println("Give Proper Input..");
			
		}
		System.out.println("Thank you using our application...!");
		
}
}
