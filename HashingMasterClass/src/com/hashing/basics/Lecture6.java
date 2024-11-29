package com.hashing.basics;

public class Lecture6 {
	
	public static void main(String[] args) {
		
		/*
		 *  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 

		 */
		
		int nums[] = {0,1,2,3,4,5,6,7,8,9};
		int l=2, r=4;
		int pres[] = new int[nums.length+1];
		            //0 1 3 5 7 9 11 13 15 17 0 
		
		for(int i=1;i<nums.length;i++) {
			
			pres[i] = nums[i-1]+nums[i];
		}
		
		System.out.println(pres[r]-pres[l-1]);
		
	}
}
