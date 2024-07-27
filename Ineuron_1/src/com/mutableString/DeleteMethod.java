package com.mutableString;

public class DeleteMethod {
public static void main(String[] args) {
	
		StringBuilder str = new StringBuilder("TeluskoiNeuron");
		
		System.out.println(str.length());
		System.out.println(str.delete(0, 7));
		//System.out.println(str);
		
		StringBuilder sb = new StringBuilder("Sachin");
		
		System.out.println(sb.reverse());
}
}
