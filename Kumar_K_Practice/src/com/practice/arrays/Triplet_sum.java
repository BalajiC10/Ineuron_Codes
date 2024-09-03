package com.practice.arrays;

public class Triplet_sum {
public static void main(String[] args) {
	
		int ar[]= {4,1,2,7,9,5};
		int sum=0;
		for(int i=0; i<ar.length;i++) {
			
			for(int j=i+1; j<ar.length;j++) {
				
				for(int k=j+1;k<ar.length;k++) {
					sum+=ar[i]+ar[j]+ar[k];
				}
			}
		}
		System.out.println(sum);
}
}
