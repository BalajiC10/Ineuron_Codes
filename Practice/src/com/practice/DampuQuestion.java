package com.practice;

public class DampuQuestion {
public static void main(String[] args) {
	
	int n=22074;
	
	int temp=n;
	int c=0;
	while(n!=0) {
		
		int t=n%10;
		
		if(t!=0)
		if(temp%t==0) {
			c++;
		}
		n/=10;
	}
	System.out.println(c);
}
}
