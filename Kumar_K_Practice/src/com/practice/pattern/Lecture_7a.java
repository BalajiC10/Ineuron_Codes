package com.practice.pattern;

public class Lecture_7a {
public static void main(String[] args) {
	
		int n=5;
		//Parallelogram Pattern
		for(int i=0;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}
			for(int l=1;l<=n;l++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
}
}
