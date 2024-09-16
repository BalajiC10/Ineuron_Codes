package com.Exception;

class Test5{
	
	int disp() {
		
		try {
			System.out.println("Display Method");
			return 10; //While going it will return in end
		}
	
		finally {
			System.out.println("Inside Finally Block");
		}
	}
	
	
}

public class FinallyVsReturn {
public static void main(String[] args) {
	
		Test5 t = new Test5();
		System.out.println(t.disp());
}
}
