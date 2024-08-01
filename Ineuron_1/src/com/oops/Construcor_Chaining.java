package com.oops;

public class Construcor_Chaining {

	//if we call one const to another const it called constr chering
	
	private int age;
	private String name;
	
	public Construcor_Chaining() {
		
		this(20,"Balaji");
	}
	
	public Construcor_Chaining(int age,String name) {
		
		this.age=age;
		this.name=name;
		
	}
	
	public Construcor_Chaining(int age) {
		this();
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		
		return name;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Non param const calling: ");
		Construcor_Chaining en = new Construcor_Chaining();
		System.out.println(en.getAge());
		System.out.println(en.getName());
		
		System.out.println("--------------------------------");
		System.out.println("param const calling: ");
		
		Construcor_Chaining en1 = new Construcor_Chaining(10);
		
		System.out.println(en1.getAge());
		System.out.println(en1.getName());
		
		
	}
	
	
}
