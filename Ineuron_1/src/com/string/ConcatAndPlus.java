package com.string;

public class ConcatAndPlus {
public static void main(String[] args) {
	
		String s1 = "Telusko"+"Ineuron";
		
		String s2 = "Telusko"+99;
		
		String s3 = "Telusko"+99+99+10;
		
		String s4 = 10+4+"Telusko";
		
		String s5 = "String"+5+6;
		
		System.out.println(s1); //TeluskoIneuron
		System.out.println(s2); //Telusko99
		System.out.println(s3); //Telusko999910
		System.out.println(s4); //14Telusko (if first integers are ther it adds and concat the string
		System.out.println(s5); //String56
				
}
}
