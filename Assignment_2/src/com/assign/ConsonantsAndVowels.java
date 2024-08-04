package com.assign;

public class ConsonantsAndVowels {
public static void main(String[] args) {
	
	String str = "iNeuron Telusko";
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("vowels are :"+ch);
		}
		else {
			//System.out.println("Consonants are :"+ch);
		}
	}
}
}
