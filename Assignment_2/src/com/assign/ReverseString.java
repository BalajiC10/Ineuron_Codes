package com.assign;

public class ReverseString {
public static void main(String[] args) {
		
		String str = "iNeuron";
		
		String ans="";
		
		for(int i=str.length()-1;i>=0;i--) {
			ans=ans+str.charAt(i);
		}
		System.out.println("Originial String : "+str);
		System.out.println("Reversed String : "+ans);
		
		System.out.println("----------------------------------------");
		
		//Think Twice == 
		
		String s = "Think Twice";
		System.out.println("Original String: "+s);
		String a="";
		s=s.toLowerCase();
		String arr[] =s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			String temp =arr[i];
			
			for(int j=temp.length()-1;j>=0;j--) {
				sb.append(temp.charAt(j));
			}
			sb.append(" ");
		}
		//System.out.println(sb);
		a=sb.toString();
		
		System.out.println("Reversed String : "+a);
		
		
		
}
}
