package com.array;
import java.util.*;

public class Array2dDemo {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int arr[][] =new int[3][4];
		
		for(int i=0;i<arr.length;i++) {
			
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the number of: "+i+" student "+j);
					arr[i][j]=sc.nextInt();
				}
		}
		
		System.out.println("Marks of student are:");
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
	}
		
		
}
}

