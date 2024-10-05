package com.hashing.basics;

import java.util.HashSet;

public class CheckSubset {
	
	/*
	 * Check if the given array is subset of another array.
	 * Time complexity: O(n+m), as we traverse both array once.

	   Space complexity: O(n) , as there are only n elements inserted in the hashset so it takes O(n) space .
	 */
	
	public void isSubset(int arr[], int brr[])
	
	{
		
		HashSet set = new HashSet();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(int j:brr) {
			
			if(!set.contains(j)) {
				System.out.println("brr is not subset of arr");	
				return ;
			}
		}
		System.out.println("brr is subset of arr");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSubset ck = new CheckSubset();
		
		int arr[]= {2,4,7,1,5};
		int brr[]= {7,4,2};
		
		ck.isSubset(arr, brr);
		

}
}
