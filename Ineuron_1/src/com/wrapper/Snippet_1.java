package com.wrapper;

public class Snippet_1 {
public static void main(String[] args) {
	
		/*
		 * Note:
			Immutable Object -> String,all wrapper classes  
			(String - SCP)
			(wrapper class - stores in Buffer range) 

			(if we try to make a change, then with the

				change new object will be created)
		 */
	
			Integer i = 10;
			Integer i1 = 10; //Both will point on one literal only
			System.out.println(i==i1); //True
}
}
