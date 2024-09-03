package com.practice.arrays;

public class SumOfPairsTwoArrays {
	//Sum of pairs using two arrays
	
	public static void main(String[] args) {
		
		int a[]= {5,2,8,4,9,3};
		int b[]= {2,5,9,5,7,3};
		
		for(int i=0;i<a.length;i++) {
			
			
				
				if(a[i]+b[i]==6) {
					System.out.println(a[i]+" "+b[i]);
				}
			
		}
	}
}

