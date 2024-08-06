package in.ineuron.test;


import in.ineuron.entities.Course;
import in.ineuron.entities.Student;

public class TestApp {
public static void main(String[] args) {
	
	
		Course c1 = new Course();
		c1.setcId(100);
		c1.setcName("Java");
		c1.setcCost(1000);
		
		Course c2 = new Course();
		c2.setcId(200);
		c2.setcName("Python");
		c2.setcCost(500);
		
		Course c3 = new Course();
		c3.setcId(300);
		c3.setcName("C++");
		c3.setcCost(1200);
		
		Course course1[] = new Course[2];
		course1[0]=c1;
		course1[1]=c2;
		
		Course course2[] = new Course[2];
		course2[0]=c1;
		course2[1]=c3;
		
		Student s1 = new Student();
		s1.setsId(701);
		s1.setsName("Rohit");
		s1.setCourse(course1);
		s1.display();
		
		
		Student s2 = new Student();
		s1.setsId(702);
		s1.setsName("Virat");
		s1.setCourse(course2);
		s1.display();
		
		
		
		
}
}
