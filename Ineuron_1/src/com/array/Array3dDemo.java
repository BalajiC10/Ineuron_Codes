package com.array;
import java.util.*;

public class Array3dDemo {
public static void main(String[] args) {
		//school,class,student.
		
		int arr[][][]= new int[3][2][3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					
					System.out.println("Enter the marks of school "+i+" of class "+j+" student "+j);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Marks of Students: ");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					
					System.out.print(arr[i][j][k]);
					
				}
			}
			System.out.println();
		}
		
		
}
}
