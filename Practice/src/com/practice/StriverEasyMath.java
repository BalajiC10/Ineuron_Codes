package com.practice;

public class StriverEasyMath {
public static void main(String[] args) {
	
		long n=1534236469;
		
		
		
		while(n!=0) {
			
			long t=n%10;
			rev=rev*10+t;
			n/=10;
		}
		System.out.println(rev);
}
}
