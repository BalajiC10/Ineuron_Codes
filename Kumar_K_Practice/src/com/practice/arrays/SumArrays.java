package com.practice.arrays;

public class SumArrays {

	public static void main(String[] args) {
		
//		Sum and multiplication
//		 of all number in Arrays  

		int arr[]= {1,4,2,9,5,8,3,6};
		int sum=0,mul=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			
		}
		System.out.println(sum);
		
		for(int k=0;k<arr.length;k++) {
			mul*=arr[k];
		}
		System.out.println(mul);
	}
}
