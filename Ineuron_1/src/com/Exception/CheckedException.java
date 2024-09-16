package com.Exception;

public class CheckedException {
public static void main(String[] args) throws Exception  { //Duckng the Exception
	
		System.out.println("first line");
		
		Thread.sleep(5000); //If remove exception (Ducking) this will throw compile time exception.
		
		System.out.println("last line");
		
		System.out.println("throws: working with checked exception");
}
}
