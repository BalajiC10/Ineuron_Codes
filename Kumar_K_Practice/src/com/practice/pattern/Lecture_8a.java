package com.practice.pattern;

public class Lecture_8a {
public static void main(String[] args) {
	
	//Write a program to print triangle of user defined integers sum.
	
	int n=5;
	
	for(int i=1;i<=n;i++) {
		int sum=0;
		StringBuilder sb = new StringBuilder();
		
		for(int j=1;j<=i;j++) {
			 //System.out.print(j);//1,12

			 sum +=j;//1,3
			 
			 if(j>1) {
				 sb.append("+");
			 }
			 sb.append(j);
		}
		
		sb.append("=");
		sb.append(sum);
		System.out.println(sb.toString());
	}
}
}

