package com.hashing.basics;

import java.util.HashMap;
import java.util.Map;

public class CheckSubset2 {
	
	/*
	 * Problem: Check if a given array is a subset of another array. Duplicate elements can be present
	 * 
	 * Time Complexity  : O(n+m)
	   Space Complexity : O(n)
	 */
	public boolean isSubset(int arr[], int brr[]) {
		
		if(arr.length<brr.length) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i:arr) {
			
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		
		for(int j:brr) {
			
			if(!map.containsKey(j)) {
				return false;
			}
			
			if(map.get(j)==0) {
				return false;
			}
			int cnt = map.get(j);
			map.put(j, cnt-1);
		}
		
		return true;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSubset2 ck = new CheckSubset2();
		
		int[] arr = {6,7,3,2,2};
        int[] brr = {6,7,2,2};
        
        if(ck.isSubset(arr, brr)) {
        	System.out.println("brr is subset of arr");	
        }
        else {
        	System.out.println("brr is not subset of arr");	
        }
	}

}
