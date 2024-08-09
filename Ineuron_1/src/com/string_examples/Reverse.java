package com.string_examples;

public class Reverse {
public static void main(String[] args) {
	
	String s = "Think Twice";
	String a ="";
	
	String ar[] = s.split(" ");
	System.out.println("Original :"+s);
	
	for(int i=ar.length-1;i>=0;i--) {	
		a=a+ar[i]+" ";

	}
	System.out.println("Reverse :"+a);
}
}
