package com.string;

public class CompareToMethod {
public static void main(String[] args) {
	
		//it compares values lexicographically means char by char which compares ascii values
		
	
		String str ="g";
		String str1 ="";
		
		String s1 = "a"; //97 //ASCii value
		String s2 = "b"; //98
		
		int n = (int)('a');
		System.out.println(n);
		
		System.out.println(s1.compareTo(s2));// 97-98 = -1 (means s2 is bigger)
		
		if(s1.compareTo(s2)<0) {
			System.out.println("s2 is bigger");//value in negative
		}
		else {
			System.out.println("s1 is bigger");//value in positive
		}
		
		System.out.println(str.compareTo(str1));// 1 which means str is bigger
}
}
