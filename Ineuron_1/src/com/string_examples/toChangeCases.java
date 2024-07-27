package com.string_examples;

public class toChangeCases {

	public static void main(String[] args) {
		//To uppercase without method
		
		String str = "india";
		
		String ans="";
		
		System.out.println("Diff between to cases A-a"+ ":"+(97-65));//
		
		for(int i=0;i<str.length();i++) {
			
			ans=ans+(char)(str.charAt(i)-32);
		}
		System.out.println(str+" to UpperCase");
		System.out.println(ans);
		
		String sb ="SACHIN";
		
		String ans1="";
		
		for(int i=0;i<sb.length();i++) {
			ans1=ans1+(char)(sb.charAt(i)+32);
		}
		System.out.println(sb+" to Lowercase");
		System.out.println(ans1);
	}

}
