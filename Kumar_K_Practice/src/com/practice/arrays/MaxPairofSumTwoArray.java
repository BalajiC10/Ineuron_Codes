package com.practice.arrays;

public class MaxPairofSumTwoArray {
public static void main(String[] args) {
	
		
		
		int a[]= {10,9,4,5,2,8,7};
		int b[]= {2,5,9,5,7,3,6};
		int maxSum=0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<a.length;i++) {
		
			StringBuilder s = new StringBuilder();
			
			for(int j=0;j<b.length;j++) {
				
				int sum=a[i]+b[i];
				//System.out.println(sum);
				if(sum>maxSum) {
					
				}
			}
			
		}
		//System.out.println(maxSum);
		System.out.println(sb);
		
}
}
