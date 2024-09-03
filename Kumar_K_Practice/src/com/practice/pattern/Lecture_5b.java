package com.practice.pattern;

public class Lecture_5b {
public static void main(String[] args) {
	 
	    int n=1; 
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>=i;j--) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		for(int b=0;b<=n;b++) {
			for(int a=0;a<b;a++) {
				System.out.print(" ");
			}
			for(int c=n;c>=b;c--) {
				System.out.print("*");
			}
			
			for(int z=n;z>b;z--) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
