package com.inherit;


class Person{
	
	String name;
	Integer id;
	
	public Person(String name, Integer id) {
		
		this.name=name;
		this.id=id;
	}
	
	void getDetails() {
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
	}
	
	
}

class Student extends Person{
	
	Integer address;
	String city;
	
	public Student(String name, Integer id,Integer address,String city) {
		super(name, id);
		this.address=address;
		this.city=city;
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println("address is "+address);
		System.out.println("city is "+city);
		
	}
}
public class TightAndLooseCoupling {
public static void main(String[] args) {
	
		Student s1 =  new Student(null, null, null, null); //Tight coupling
		Person P1  =  new Person(null, null);              //Loose Coupling 
		
}
}
