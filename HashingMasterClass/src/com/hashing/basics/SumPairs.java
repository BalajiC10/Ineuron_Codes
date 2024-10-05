package com.hashing.basics;
import java.util.*;

public class SumPairs {
	/*
	 * Given an array and target 'x', Find out the pair from array whose sum forms the number 'x' 
	 * when both the numbers of the pair are added) -->Hashing Approch
	 */
	
	public static boolean findPairs(int arr[], int k) {
		
		Set set = new HashSet();
		
		for(int i=0;i<arr.length;i++) { //0, -1, 2, -3, 1
			
			int target = k-arr[i]; //0-(-2)
			
			if(set.contains(target)) {
				return true;
			}
			set.add(arr[i]);
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int arr1[] = {1, -2, 1, 0, 5};
		if(SumPairs.findPairs(arr1, 0)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
