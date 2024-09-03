package com.hashing;
import java.util.*;

//Hashing - A technique used to store the numbers with their frequencies in easy manner 
public class Launch1 {

	/* Question :- You are given an array of size “n” ; you are also given “Q” 
	               queries for each of the query please tell how many times a given number occurs in the array. */
	
	public static void main(String[] args) {
		//Time complexity of this queston is O(n*q) 
		//As In coding question input array will not be considered in TC.
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter size of an array");
		int n = scan.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Please enter "+n+" elements:");
			 array[i]=scan.nextInt();
		}
		
		System.out.println("Enter size of query");
		int q = scan.nextInt();
		
		for(int k=0;k<q;k++) {
			System.out.println("Enter "+q+" queries:");
			int query = scan.nextInt();
			
			
			int count=0;
			
			for(int j=0;j<n;j++) {
				
				if(array[j]==query) {
					System.out.println();
					count++;
				}
				
			}
			System.out.println("Number "+query+" is counted this times "+count);
		}
		
		
	}
}
