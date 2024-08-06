package com.poly.onetoone_association;

public class Employee { //Target Object

	private Integer eId;
	private String  eName;
	private Integer eAge;
	private String  eLocation;
	private Account account; //Dependant object
	

	//Setter Injection
	public void seteId(Integer eId) {
		this.eId = eId;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}



	public void seteLocation(String eLocation) {
		this.eLocation = eLocation;
	}



	public void setAccount(Account account) {
		this.account = account;
	}








	public void display() {
		
		System.out.println("Employee Details:");
		System.out.println("Employee Id: "+eId);
		System.out.println("Employee Name: "+eName);
		System.out.println("Employee age: "+eAge);
		System.out.println("Employee location: "+eLocation);
		
		
		System.out.println("-----------------------------------------");
		System.out.println("Account Details");
		System.out.println("Account Number: "+account.getAccNo());
		System.out.println("Account Name: "+account.getAccName());
		System.out.println("Account Type: "+account.getAccType());
		
		
		
	}
	
	
	
	
}
