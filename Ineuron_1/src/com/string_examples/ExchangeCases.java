package com.string_examples;

public class ExchangeCases {
public static void main(String[] args) {
		
		//Reverse the cases 
		String str = "BaLaJi";
		
		String ans="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch<=97 && ch>=65) {
				//System.out.println(str.charAt(i));
				ans=ans+(char)(ch+32);
			}
			 if(ch>=97 && ch<=122) {
			//System.out.println(ch);
			ans=ans+(char)(ch-32);
			}
		}
		System.out.println(ans);
}
}
