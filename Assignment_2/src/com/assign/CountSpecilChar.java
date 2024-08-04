package com.assign;

public class CountSpecilChar {
public static void main(String[] args) {
	
		String str = "ab%js#";
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
				count++;
			}
		}
		System.out.println(count);
}
}
