package com.practice.pattern;

public class Lecture_5a {

	public static void main(String[] args) {
		
		int n=4;
		int v=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			int temp=v;
			for(int k=1;k<=i;k++) {
				System.out.print(temp);
				temp++;
				
			}
		
			System.out.println();
			v++;
		}
	}
}
