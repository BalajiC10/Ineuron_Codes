package com.poly;

class Ap{
	
	//Final keyword applies to class level, variable, and method.
	//Final class:- cannot be inherited /cant extend the class
	//Final Variable:- cannot be changed
	//Final Method:- cannot be overridden
	
	final int a=20;
	
//	final public void show() {
//		
//	}

	
}

class Mh extends Ap {
	
	public void show() {
		//Compile Error
	}
}

public class FinalKeyword {

}
