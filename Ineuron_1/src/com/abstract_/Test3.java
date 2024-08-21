package com.abstract_;

interface Aa{
	
	void show();
	
	default void disp() {
		System.out.println("intt Aa");
	}
}

interface Ba{
	
	void show();
	
	
	default void disp() {
		System.out.println("intt Ba");
	}
}



class Ca implements Aa,Ba{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show c");	
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		Ba.super.disp();
	}
	
}

public class Test3 {
public static void main(String[] args) {
	
		Ca obj = new Ca();
		obj.disp();
		
		
}
}
