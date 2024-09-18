package com.wrapper;

public class AutoBoxing {

		static Integer I = 10; //AutoBoxing (ValueOf())
		
//		Integer i = 10;
//		|
//		|compiler will make the following change
//      |
//		|
//		Integer i = Integer.valueOf(10);
		
		/*
		 * Automatic conversion of primitive type to wrapper type done by the compiler is
		   called "AutoBoxing".
		 */
		
		
		
		public static void main(String[] args) {
			
			int i = I; //AutoUnBoxing (intValue()) int i = I.intValue();
			/*
			 * Automatic conversion of wrapper type to primtive type done by the compiler is
			   called "AutoUnBoxing".
			 */
			System.out.println(i); //10
		}
}
