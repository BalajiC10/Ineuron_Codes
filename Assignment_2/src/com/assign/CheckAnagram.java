package com.assign;
import java.util.*;
public class CheckAnagram {
public static void main(String[] args) {
	
		String s1 = "cork";
		String s2 = "rock";
		
		int arr[] = new int[26];
		
		
		for(int i=0;i<s1.length();i++) {
			
			arr[s1.charAt(i)-96]++;
			
		}
		for(int i=0;i<s2.length();i++) {
			
			arr[s2.charAt(i)-96]--;
		}
		
		
		int count=0;
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]!=0) {
				count++;
			}
			else {
				continue;
			}
		}
		if(count>0) {
			System.out.println("Not anagram");
		}
		else {
			System.out.println("Anagram");
		}
		
 }
}
