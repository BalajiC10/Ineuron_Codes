package in.ComparableVsComparator;

import java.util.ArrayList; //should import this only
import java.util.*; //it will load all classes so time consuming

class Student implements Comparable<Student>{
	
	int age;
	String name;
	String tech;
	
	Integer i;
	//Comparable:-Single logic sorting (Can compare only single entity or object at a time)
	//Used for custom sorting
	
	@Override
	public String toString() { //if you dont use it will print hash values
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
	public Student(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	 // Implementing the compareTo method for sorting based on the name
	@Override
	public int compareTo(Student that) {
		
		//return this.age - that.age; //Ascending order -age
		
		//return that.age- this.age; //Descending order -age
		
		return this.name.compareTo(that.name); //sort based on -name (reverse if you need descending order
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTech() {
		return tech;
	}


	public void setTech(String tech) {
		this.tech = tech;
	}


	public Integer getI() {
		return i;
	}


	public void setI(Integer i) {
		this.i = i;
	}
	
	
	
	
	
}

public class ComparableLaunch {
public static void main(String[] args) {
	
		Student s1 = new Student(23,"Aswini","Cloud");
		Student s2 = new Student(25,"Balaji","Java");
		Student s3 = new Student(20,"Ram","Cpp");
		Student s4 = new Student(43,"Vijay","SAP");
		Student s5 = new Student(18,"Sachin","Medical");
		
		ArrayList<Student> list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("Original data: ");
		System.out.println(list);
		System.out.println();
		
		
		System.out.println("Compared Name here");
		Collections.sort(list); 
		System.out.println(list);
		
		
}
}
