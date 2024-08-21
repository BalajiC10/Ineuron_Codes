package com.interfac;

interface ISample{//Customer Requirement Specification
	
	public void m1();
	public void m2();
	default void m3() {
		//dummy logic
	}
	
	default void m4() {
		//dummy logic
	}
	
	default void m5() {
		//dummy logic
		show();
	}
	
	private void show() {
		//logic //can be used in same interface.
	}
}

class SampleImpl implements ISample{

	@Override
	public void m1() {
		//logic
		
	}

	@Override
	public void m2() {
		//logic
		
	}
	
	
}

public class DefaultMethod {

}
