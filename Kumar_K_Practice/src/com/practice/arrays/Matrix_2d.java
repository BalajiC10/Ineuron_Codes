package com.practice.arrays;

public class Matrix_2d {
public static void main(String[] args) {
	
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			
//			System.out.print(arr[i][j]+" ");
//		}
//		System.out.println();
//	}
	//System.out.println(arr[0].length);
	
	

	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			
			if(i==j) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
	}
}
}
