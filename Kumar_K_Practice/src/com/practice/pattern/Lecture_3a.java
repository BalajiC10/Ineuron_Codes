package com.practice.pattern;

public class Lecture_3a {
public static void main(String[] args) {
	
		int num=6;
		char c='A';
		for(int i=1;i<=num;i++) {
			
			char cc = c;
			for(int j=1; j<=i;j++) {
				
				System.out.print(cc);
				cc=(char)(cc+1);
			}
			
			System.out.println();
			c++;// Update the starting character for the next row
		}
}
}
