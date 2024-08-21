package com.abstract_;

interface Demo{
	
	void disp();
	
	public static final int num = 100; //By Defualt
	
	static void show() {
		
		System.out.println("I am static method in Interface");
	}
	
	
	default void shock2() {	
		shock();
	}
	//Java 9 
	private void shock() {
		System.out.println("Private Method in Interface");
	}
}

public class Launch3 {
	
	public static void main(String[] args) {
		Demo.show();//we can invoke interface static method without creating objet.
		
	}

}
