
package com.oops;

public class Method_Overloading {
	
	//same class and same method name but different parameters.
	//body signature:method name, method param and type of param.
	
	public int add(int num1,int num2) {
		
		int result =num1+num2;
		
		return result;
	}
	
	public int add(int num1,int num2,int num3) {
		int result = num1+num2+num3;
		
		return result;
	}
}
