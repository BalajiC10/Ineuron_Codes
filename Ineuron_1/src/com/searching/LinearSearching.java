package com.searching;

public class LinearSearching {

	public static void main(String[] args) {
		
		int key=45;
		
		int arr[]= {10,20,30,45,25,50};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
				System.out.println("Element found at "+i+" index");
			}
		}
	}
}
