package com.Exception;

import java.util.Scanner;

class UnderAgeException extends Exception{
	
	UnderAgeException(String msg){
		super(msg);
	}
}

class OverAgeException extends Exception{
	
	OverAgeException(String msg){
		super(msg);
	}
}


class LApp{

	private int age;
	
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age for license");
		age = scan.nextInt();
	}
	
	public void verify() throws Exception {
		
		if(age>=18 && age<=60) {
			
			System.out.println("You are Eligible for License");
		}
		else if(age<18) {
			
			System.out.println("Not Eligible for License");
			
			throw new UnderAgeException("Under age not allowed");
		}
		else if(age>60) {
			
			System.out.println("Not eligibe due to Over age");
			
			throw new OverAgeException("Over age is not allowed");
		}
	}
		
	
}
class RTO{
	
	public void initiate() throws Exception {
		LApp l1 = new LApp();
		
		try {		
		l1.input();
		l1.verify();	
		}
		catch(UnderAgeException e) {
			System.out.println(e.getMessage());
			try {		
				l1.input();
				l1.verify();	
				} 	
			catch(UnderAgeException f) {
				System.out.println(f.getMessage());
				System.out.println("UnderAge Exception....");
				System.exit(0);
			}
		}
		catch(OverAgeException g) {
			System.out.println(g.getMessage());
			try {		
				l1.input();
				l1.verify();	
				} 	
			catch(UnderAgeException f) {
				System.out.println(f.getMessage());
				System.out.println("OverAge Exception....");
				System.exit(0);
				
			}
		}
	}
	
}
public class LaunchCustomEx2 {

	public static void main(String[] args) throws Exception {
		
		RTO rt = new RTO();
		rt.initiate();
	}
}
