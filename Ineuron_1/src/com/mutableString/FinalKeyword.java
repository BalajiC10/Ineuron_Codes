package com.mutableString;

public class FinalKeyword {
public static void main(String[] args) {
	
			final StringBuilder sb = new StringBuilder("Sachin");
			sb.append("IND");//we can append but cant re initilize or modify existed one
			//If the variable if of reference type and if it is of mutable in nature as per its mutable nature the object can be changed 
			//it would not result in "CompileTimeError"
			
			System.out.println(sb);//SachinIND
			
			
			//but if we try to re assign it would result in "CompileTimeError"
			sb = new StringBuilder("Cricketer"); //Not possible because of final keyword.(throws compile time error)
			
			//If variable is of primitive type and if is final so if we try to change it should not change and should throw "CompileTimeError"
			System.out.println(sb);
			
			
}
}
