package com.wrapper;

public class Test2 {
public static void main(String[] args) {
	
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1==i2); //false -> it is costly event shouldnt use this new keyord and creation of new object
		
		
		Integer i3 = 10; //AutoBoxing (valueOf(10)); -->Always prefer this utility method as it saves memory
		Integer i4 = 10; //AutoBoxing (valueOf(10));
		System.out.println(i3==i4); //true
		
		Integer i5 = 20; //will this create object
		System.out.println("Yes...it will use object which already available in buffer range");
}
}
