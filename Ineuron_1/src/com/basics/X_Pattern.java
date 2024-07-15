package com.basics;

public class X_Pattern {
public static void main(String[] args) {
	
		int n=10;
		
		for(int i=0;i<n;i++) {
			
				for(int j=0;j<n;j++) {
					
					if(i==j || i+j==n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				
					
					for(int k=0;k<n;k++) {
						
						if(i==k || i+k==n-1 || i==0 || k==0 || i==n-1 || k==n-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
			   
				
				System.out.println();
		}
		
}
}
