package com.searching;

public class BinarySearch {
public static void main(String[] args) {
	
		int arr[] = {10,20,25,30,40,50,60};
		
		int key=30;
		
		int l=0;
		int h=arr.length;
		int m=l+h/2;
		
		while(l!=h) {
			
			if(key==arr[m]) {
				System.out.println("Element found at "+m);
				break;
			}
		}
}
}
