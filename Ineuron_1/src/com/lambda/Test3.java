package com.lambda;

interface Calculator{
	
	public void add(int a, float b);
	
}
public class Test3 {

	public static void main(String[] args) {
		
			Calculator cal = (int a,float b) -> System.out.println(a+b);
					
			cal.add(10, 20);			
	}
}
