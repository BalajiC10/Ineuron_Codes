package com.wrapper;

public class AutoUnBoxing {
	
	static Integer I =200; //AutoBoxing (valueOf())
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = I; //AutoUnboxing (intValue())
		System.out.println(i);
	}

}
