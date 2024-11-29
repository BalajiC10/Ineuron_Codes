package com.hashing.basics;

import java.util.HashMap;

public class Lecture7 {
public static void main(String[] args) {
	
		int k=3;
		
		int arr[] = {1,0,1,2,10,};
		
		/* 
		 * Find count of number of subarrays with sum ==  k 
		 * 
		 * 
		 * */
		int sum=0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				
				sum+=arr[j];
				if(sum==k) {
					cnt++;
					break;
				}
			}
			
		}
		System.out.println(cnt);
		
		int brr[] = {1,0,1,2,10,};
		
		HashMap<Integer, Integer> map = new HashMap();
		int presum=0, count=0;
		
		for(int j=0;j<brr.length;j++) {
			
			presum+=brr[j]; //1
			
			int remove = presum-k; //1-3 =-2
			
			count+=map.getOrDefault(remove,0);
			
			map.put(presum, map.getOrDefault(presum, 0)+1); //(0,1)(-2,1)
			
		}
		System.out.println(count);
		
		
}
}
