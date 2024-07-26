package com.array;

public class ForEachLoop {
public static void main(String[] args) {
		//Whenever index are not important we can go with for each loop
	
		System.out.println("Printing 1D array using for each loop:");
		int ar1[] = {10,20,30,40,50};
		
		for(int elements:ar1) {
			System.out.println(elements);
		}
	
	
		System.out.println("Printing 2D array using for each loop:");
		int arr[][]= {{10,20,30},{40,50}};
		for(int ar[]:arr) {
			
			for(int element:ar) {
				System.out.println(element);
			}
		}
		
}
}
