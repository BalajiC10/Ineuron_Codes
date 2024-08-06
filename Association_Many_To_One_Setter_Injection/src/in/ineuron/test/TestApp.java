package in.ineuron.test;

import in.ineuron.entities.Branch;
import in.ineuron.entities.Student;

public class TestApp {
public static void main(String[] args) {
	
		Branch b = new Branch();
		b.setBid(100);
		b.setBname("Mechanical");
		
		Student s1 = new Student();
		s1.setSage(22);
		s1.setSid(123);
		s1.setSname("Balaji");
		s1.setBranch(b);
		
		
		Student s2 = new Student();
		s2.setSage(20);
		s2.setSid(563);
		s2.setSname("Virat");
		s2.setBranch(b);
		
		s1.display();
		s2.display();
		
		
}
}
