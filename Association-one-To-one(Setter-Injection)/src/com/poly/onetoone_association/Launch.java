package com.poly.onetoone_association;

public class Launch {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccName("Balaji");
		ac.setAccNo(200);
		ac.setAccType("Savings");
		
		Employee e = new Employee();
		e.setAccount(ac);
		e.seteAge(20);
		e.seteId(220);
		e.seteLocation("Solapur");
		e.seteName("Don");
		
		e.display();
		
	}
	
	
}

