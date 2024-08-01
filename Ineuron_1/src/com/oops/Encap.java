package com.oops;

public class Encap {
	private int num;
	private String brand;
	
	public void setNum(int num) {
		
		if(num>=0) {
			System.out.println("Invalid Number...");
		}
		else {	
			this.num=num; //this.num refers to instance variable
		}
	}
	
	public int getNum() {
		
		return num; 
	}
	
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getBrand() {
		
		return this.brand;
	}
	
	
public static void main(String[] args) {
	
		Encap en = new Encap();
		en.setNum(-0);
		
		System.out.println(en.getNum());
}
}
