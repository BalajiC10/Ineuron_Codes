package com.poly.onetoone_association;

public class Account {

	private Integer accNo;
	private String accType;
	private String  accName;
	
	//Constructor Injection
	public Account(Integer accNo, String accType, String accName) {
		
		this.accNo = accNo;
		this.accType = accType;
		this.accName = accName;
		
	}


	public Integer getAccNo() {
		return accNo;
	}


	public String getAccType() {
		return accType;
	}


	public String getAccName() {
		return accName;
	}


	
	
	
	
	

}
