package com.oops;

public class Launch {
public static void main(String[] args) {
	
		Method_Overloading mo = new Method_Overloading();
		int result = mo.add(10, 20);
		int result1 = mo.add(10, 20, 30);
		System.out.println(result);
		System.out.println(result1);
}
}
