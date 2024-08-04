package com.statick;

public class ConstructorCount {
	private int age;
	private String name;
	
	static int count;
	
	{
		count++;
		System.out.println("This Non static block will execute before going into constructor");
		System.out.println("it will execute every time when object created");
	}
			 		
	 ConstructorCount() {
		
	}
	
	public ConstructorCount(int age) {
		
		this.age=age;
	}
	
	public ConstructorCount(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		
		ConstructorCount en = new ConstructorCount();
		ConstructorCount en1 = new ConstructorCount(10);
		ConstructorCount en2 = new ConstructorCount(10,"Balaji");
		System.out.println(ConstructorCount.count);
		
	}
	
}
