package com.inherit;

public class Launch1 {

	public static void main(String[] args) {
		
		cal3 cal = new cal3();
		System.out.println("Multi Level and Single level Inheritance");
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(20, 10));
		System.out.println(cal.multi(10, 10));
	}
}
