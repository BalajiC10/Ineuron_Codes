package com.Exception;

public class Test3 {
public static void main(String[] args) {
	
		
		try {
			
			int a= 10/0;
			String s = null;
			System.out.println(s);
		}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		finally {
			System.out.println("Finally block");
		}
}
}
