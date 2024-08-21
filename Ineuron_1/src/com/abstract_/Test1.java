package com.abstract_;

interface A{
	
	void add();
}

interface B extends A{
	
	void sub();
}

class C implements B{

	@Override
	public void add() {
		// TODO Auto-generated method stub
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
	}
	
}

class D implements B{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}


	
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
