package com.practice.pattern;

public class Lecture_2b {
public static void main(String[] args) {
	
		int n=7 ;
		char c='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(c);
				
			}
			c=(char)(c+1);
			System.out.println();
		}
}
}
