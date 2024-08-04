package com.assign;

public class CheckPangram {
public static void main(String[] args) {
	
		/* A string is a pangram string if it contains all 
	       the character of the alphabets ignoring the case of the alphabets. */
			
		String s = "SachinRameshTendulkra";
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		int count=0;
		
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			
			if(ch<='z' && ch>='a') {
				count++;
			}
		}
		System.out.println(count);
		
		if(count==26) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not Pangram");
		}
		
		
	
		
	
}
}
