package com.practice;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		
		int arr[]= {4,6,2,3,8,9,};
		int sum=0;
		List<List<Integer>> list =new ArrayList();
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				sum+=arr[i]+arr[j];
				
			}
			//break;
		}
		System.out.println("Total pair sum: "+sum);
	}
}
