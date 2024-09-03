package com.practice.arrays;

public class SumofEvenaAndOdd {
public static void main(String[] args) {
	
		
		int arr[]= {5,7,4,2,3,8,6,10};
		int esum=0,odsum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				//System.out.println(arr[i]);
				esum+=arr[i];
			}
			else {
				odsum+=arr[i];
			}
		}
		
		System.out.println("Sum of Even num "+esum);
		System.out.println("Sum of od Num "+odsum);
		
}
}
