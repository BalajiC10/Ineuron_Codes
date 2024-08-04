package com.inherit;

public class cal4{
	
	public int show() {
		System.out.println("show method");
	}
}
public class cal5{
	
	public int show() {
		System.out.println("show method");
	}
}

public class MultipleInheritance extends cal4, cal5{
	MultipleInheritance a = new MultipleInheritance();
	a.show();//here it will make ambiquity error so do its not possible incase of class concept
	
	
}
