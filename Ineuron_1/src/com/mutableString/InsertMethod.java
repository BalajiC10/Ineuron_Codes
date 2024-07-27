package com.mutableString;

public class InsertMethod {
public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("abcdefgh");
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //16+8 =24
		
		sb.insert(2, "xyz");
		System.out.println(sb);
		System.out.println(sb.length());//11
		System.out.println(sb.capacity());//24
		
		sb.insert(11,"99");
		System.out.println(sb);
		
		
		//Set length of string
		
		StringBuffer s1 = new StringBuffer("SachinRameshTendulkar");
		s1.setLength(6);
		System.out.println("just name "+s1);
}
}
