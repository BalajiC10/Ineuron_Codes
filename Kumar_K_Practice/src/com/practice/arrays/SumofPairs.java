package com.practice.arrays;

public class SumofPairs {
public static void main(String[] args) {
	
		int pair=5;
		
		int arr[]= {1,4,2,9,5,8,3,6};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int k=1; k<arr.length;k++) {
				
				if((arr[i])+(arr[k])==pair) {
					System.out.println(arr[i]+" "+arr[k]);
				}
			}
		}
				
}
}
