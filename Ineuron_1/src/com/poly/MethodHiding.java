package com.poly;

class Telusko{
	
	public static void show() {
		System.out.println("In Telusko");
	}
}

class Alien extends Telusko{
	//static method will be inherited here but we cant overridden it.
	//it will dominate here when show() method gets call and executes inherited show method
	static int count;
	{
		count++;
	}
	public static void show() {
		System.out.println("In Alien"); //Overridden Method
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		Alien a = new Alien();
		a.show();

		
		Telusko t1 = new Alien();
		t1.show();//Telusko show gets inherited in Alien class and executes it
		System.out.println(a.count); //To check weather it is coming from Alien class only. 
	}
}
