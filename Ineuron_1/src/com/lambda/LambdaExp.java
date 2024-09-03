package com.lambda;

interface Alpha{
	
	void show(); //Functional, Marker, Normal types of Interface.
}

public class LambdaExp {
public static void main(String[] args) {
	
//		Alpha a = new Alpha() { //Anonymous Innerclass Implementation 
//			
//			public void show() {
//				System.out.println("Lambda Expression used to implement Funtional Interface");
//			}
//		};
//		a.show();
	
		//Here we are not mentioning which method to implements so we useed functional interface.
		Alpha a = () -> System.out.println("Labda Expression used to implement Funtional Interface");
		a.show();
}
}
