package in.streamapi;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student{
	
	int age;
	String name;
	String tech;
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
	public Student(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
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
	
	
}
public class Launch3 {
public static void main(String[] args) {
	
	/*
	 * Filter based on students tech
	 */
	
	Student s1 = new Student(20,"Balaji","Java");
	Student s2 = new Student(22,"Vasu", "Data");
	Student s3 = new Student(25, "Sarish", "Python");
	Student s4 = new Student(24, "Rohan", "Mech");
	Student s5 = new Student(23,"Rohit","cpp");
	
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	students.add(s5);
	
	Stream stream1 = students.stream();
	
	//System.out.println(stream1); Print address
	
	
	//stream1.forEach(n->System.out.println(n)); //Print student data
	
//	Predicate<Student> pr = new Predicate<Student>() {
//
//		@Override
//		public boolean test(Student t) {
//			
//			if(t.getTech().equals("Java")) {
//				return true;
//			}
//			return false;
//		}
//		
//		
//	};
//	Stream<Student> stream2 = stream1.filter(pr);
	
	Stream<Student> stream2 = stream1.filter(t->(((Student) t).getTech().equals("Java")) ); //Stream API
	
	stream2.forEach(n->System.out.println(n));
	
	
	
			
			
	
	
}
}
