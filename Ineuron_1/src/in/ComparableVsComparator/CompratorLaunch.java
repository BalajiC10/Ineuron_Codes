package in.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
	
	int age;
	String name;
	String tech;
	
	/* 
	 *  Comparator:-Multiple logic sorting (can compare multiple objects at a time)
	 *  Used for custom sorting
	 */
	
	@Override
	public String toString() { //if you dont use it will print hash values
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
	public Student1(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}
	


	
	
}

// Comparator:-Multiple logic sorting (can compare multiple objects at a time)
class AgeComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
	
}

class NameComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name)	;
	}
	
	
}

class TechComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.tech.compareTo(o2.tech)	;
	}
	
	
}


public class CompratorLaunch  {
public static void main(String[] args) {
	
	Student1 s1 = new Student1(23,"Aswini","Cloud");
	Student1 s2 = new Student1(25,"Balaji","Java");
	Student1 s3 = new Student1(20,"Ram","Cpp");
	Student1 s4 = new Student1(43,"Vijay","SAP");
	Student1 s5 = new Student1(18,"Sachin","Medical");
	
	ArrayList<Student1> list = new ArrayList();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	System.out.println("Original List: ");
	System.out.println("-------------------------------");
	System.out.println(list);
	System.out.println("===============================");
	
	
	
	System.out.println("Comparator with respect to 'Age': ");
	Collections.sort(list,new AgeComparator());
	System.out.println(list);
	System.out.println("===============================");
	System.out.println("Comparator with respect to 'Name': ");
	Collections.sort(list, new NameComparator());
	System.out.println(list);
	System.out.println("===============================");
	
	System.out.println("Comparator with respect to 'Tech': ");
	Collections.sort(list, new TechComparator());
	System.out.println(list);
	System.out.println("===============================");
}
}
