package com.string;

public class StringA {
public static void main(String[] args) {
	
		String str ="Alien";//SCP+Heap (JVM keeps one copy)
		String str1 = "alien"; //SCP+Heap
		String str3 = new String("Alien"); //Heap memory
		System.out.println(str==str1); //Both SCP but diff value so False
		
		System.out.println(str1==str3); //DIff memory  and DIff value so False
		 
		System.out.println(str==str3); //Diff memory so False
		
		System.out.println(str.equals(str1)); //Diff value so False
		System.out.println(str.equalsIgnoreCase(str1)); //ignores cases and compares so True
		
}
}
