package com.poly.onetoone_association;

public class Launch {

	public static void main(String[] args) {
		Account ac = new Account(100,"savings","Balaji");
		Employee e = new Employee(100, "Balaji",20,"Banglore",ac);
		
		e.display();
		
	}
	
	
}

