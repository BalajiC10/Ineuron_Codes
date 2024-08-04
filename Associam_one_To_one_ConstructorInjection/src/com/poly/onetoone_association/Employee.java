package com.poly.onetoone_association;

public class Employee { //Target Object

	private Integer eId;
	private String  eName;
	private Integer eAge;
	private String  eLocation;
	private Account account; //Dependant object
	
	public Employee(Integer eId,String  eName,Integer eAge,String  eLocation, Account account) {
		
		this.eId=eId;
		this.eName=eName;
		this.eAge=eAge;
		this.eLocation=eLocation;
		this.account=account;
		
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
