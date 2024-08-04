package com.inherit;

class Telusko{
	//If there is parent child relationship in the return type so that is allowed in overridden method.
	//such type called co variant return type.
	void show() {
		System.out.println("In Telusko");
	}
}

class Alien extends Telusko{ 
	
	void show() {
		System.out.println("In Alien");
	}
}

class Animal{
	
	Telusko show() { //only this return type allowed
		
		System.out.println("In Animal");
		Telusko t = new Telusko();
		
		return t;
	}
}

class Tiger extends Animal{ //IS-A relationship
	//
	
	Alien show() {
		System.out.println("return type of child method should be same as parent method");
		System.out.println("In Tiger");
		
		Alien a = new Alien();
		return a;
	}
	
}
public class CovariantReturnType {

	public static void main(String[] args) {
		
		Tiger r = new Tiger();
		
	}
}
