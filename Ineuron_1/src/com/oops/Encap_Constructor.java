package com.oops;

public class Encap_Constructor {
	
	private int age;
	private String name;
	
	//parameterized constructor
	public Encap_Constructor(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	
public static void main(String[] args) {
	
	Encap_Constructor en = new Encap_Constructor(20, "balaji");
	System.out.println(en.getAge());
	System.out.println(en.getName());
			
}
}
