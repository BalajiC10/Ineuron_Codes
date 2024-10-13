package in.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employe{
	
	int age;
	String name;
	String tech;
	
	Integer i;
	//Comparable:-Single logic sorting (Can compare only single entity or object at a time)
	//Used for custom sorting
	
	@Override
	public String toString() { //if you dont use it will print hash values
		return "Employe [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
	public Employe(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}


	
	
}


public class Comparator_StreamApi {
	
	public static void main(String[] args) {
		
	
	Employe s1 = new Employe(23,"Aswini","Cloud");
	Employe s2 = new Employe(25,"Balaji","Java");
	Employe s3 = new Employe(20,"Ram","Cpp");
	Employe s4 = new Employe(43,"Vijay","SAP");
	Employe s5 = new Employe(18,"Sachin","Medical");
	
	ArrayList<Employe> list = new ArrayList();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	System.out.println("Original data: ");
	System.out.println(list);
	System.out.println();
	
	System.out.println("Compared Age here");
	
	Comparator<Employe> Agecomp =(o1,o2)->(o1.age-o2.age); //Power of Stream API (No need of class)
		
	Collections.sort(list,Agecomp); 
	System.out.println(list);
	
	}
}
