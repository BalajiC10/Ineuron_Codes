package com.oops;

public class Encap_TypesConstru {

	private int age;
	private String name;
	
	public Encap_TypesConstru(int age, String name) {
		//super() --parent class constructor it called. super() || this() -anyone will be present.
		//this() --constructor of the same class.
		
		this.age=age;
		this.name=name;
		
	}
	
	public Encap_TypesConstru() {
		
	}
	
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Encap_TypesConstru en = new Encap_TypesConstru();
		System.out.println("calling non param constructor values: ");
		System.out.println(en.getAge());
		System.out.println(en.getName());
		
		System.out.println("-------------------");
		Encap_TypesConstru en1 = new Encap_TypesConstru(23,"Balaji");
		System.out.println("Calling param constructor values: ");
		System.out.println(en1.getAge());
		System.out.println(en1.getName());
		
	}
	
	
}
