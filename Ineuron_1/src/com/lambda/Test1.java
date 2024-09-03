package com.lambda;
interface Computer{
	
	int add(int num1,int num2);
}

public class Test1 {

	public static void main(String[] args) {
		Computer c = (num1, num2) ->
		{
			int result =num1+num2;
			//Lambda Expression
			
			return result;
		};
		
		System.out.println(c.add(10, 10));
		
		
		
		
	}
		
		
}

