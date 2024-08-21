package com.sorting;

public class Bubble_Sorting {

	public static void sort(int arr[],int n) {
		
		int flag=0;
		
		
		for(int i=0;i<n-1;i++) {
			
			
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
					flag++;
				}
			}
			
			if(flag==0) {
				break;
			}
		}
		
		
		
		
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {13,46,24,10,9,52};
		
		
		int n = arr.length;
		
		Bubble_Sorting.sort(arr,n);
		 
	}
}
