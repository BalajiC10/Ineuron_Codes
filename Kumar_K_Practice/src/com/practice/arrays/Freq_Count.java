
package com.practice.arrays;

public class Freq_Count {
public static void main(String[] args) {
	
		int arr[]= {3,6,4,9,6,4,2,1};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[i]);
				}
			}
		}
}
}
