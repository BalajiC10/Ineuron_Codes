package com.hashing.basics;
import java.util.*;

public class CheckDuplicatesWithinK {
	
	public static boolean checkDuplicatesWithinK(int arr[], int k) {
		
		/*
		 * Brute Force
		 */
		int n = arr.length;
		
		for(int i=0;i<n;i++) {  //1, 2, 3, 4, 1, 2, 3, 4
			//                    i  i  j  j  j  
			
			for(int j=i+1;j<n;j++) { //i+k =1+3 =4
				
				if((arr[j]==arr[i]) ) {
					
					if(j-i<=k)  //4-0 =4
						
					return true;
				}
			}
		}
		return false;
		
	}
	
	

public static boolean checkDuplicatesWithinK1(int arr[], int k) {
		
	/*
	 * Hashing Approch
	 * 
	 */
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				
				int a = i- map.get(arr[i]); //3-0
				
				if(a<=k) {
					return true;
				}
				
			}
			else {
				map.put(arr[i], i);
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
	    int n = arr.length;
	    if (checkDuplicatesWithinK1(arr, 3))
	        System.out.println("Yes");
	    else
	    	System.out.println("No");
	    
	    
	}

}
