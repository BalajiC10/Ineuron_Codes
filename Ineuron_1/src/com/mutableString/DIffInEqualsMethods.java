package com.mutableString;

public class DIffInEqualsMethods {

	public static void main(String[] args) {
		
			System.out.println("case- string");
			String s1 = new String("Alien");
			String s2 = new String("Alien");
			System.out.println(s1==s2); //false (compares address)
			System.out.println(s1.equals(s2));//String object implemented equals method so it compares the value so it prints True
			
			System.out.println("-------------------------------------");
			System.out.println("case StringBuffer & StringBuilder is almost same");
			
			StringBuilder sb1 = new StringBuilder("Telusko");
			StringBuilder sb2 = new StringBuilder("Telusko");
			System.out.println(sb1==sb2);//false
			System.out.println(sb1.equals(sb2)); 
			//equals method is not avaialable in StringBuffer class, 
			//it is part of object so implementation comes from object class ,
			//which compares referance (address) so result will be False
			
			
			
			
			
	}
}
