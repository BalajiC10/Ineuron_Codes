package com.practice.arrays;

public class First_and_lastIndex_TargetValue {

		
	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6,7,8,8,10};
		
		int findex=0;
		int lindex=0;
	for(int i=0;i<arr.length;i++) {
			
		
			if(arr[i]==8) {
				findex=i;
				
				break;
			}
		}		for(int i=arr.length-1;i>=0;i--) {
			
			
			if(arr[i]==8) {
			lindex=i;
				break;
			}
		}
		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]==8) {
//				findex=i;
//				
//				if(arr[i]==8) {
//					lindex=i;
//				}
//			}
//			
//			
//		}
		
		
		
		
		System.out.println(findex);
		System.out.println(lindex);
		
	}
}
