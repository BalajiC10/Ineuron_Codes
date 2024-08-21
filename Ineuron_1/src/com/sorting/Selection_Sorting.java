package com.sorting;

public class Selection_Sorting {

	public void sort(int arr[],int n) {
		//7,4,8,2,10,6
		//0,1,2,3,4,5
	
	    
	    
		
		for(int i=0;i<=n-2;i++) {
			
			int min=i;
		
			for(int j=i;j<=n-1;j++) {
				
				if(arr[j]<arr[min]) {
				
					min=j;	
					
				}
				
			}
			
			int temp =arr[min];
			arr[min]=arr[i];
			arr[i]=temp;	
			
			
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {2,4,9,5,7,3};
		int n=arr.length;
		Selection_Sorting obj = new Selection_Sorting();
		obj.sort(arr, n);
		
		
		
	}
}
