package com.Exception;

import java.util.Scanner;


class InvalidUserExeption extends Exception{
	
	InvalidUserExeption(String msg){
			super(msg); //This will go to Throwable constructor  
	}
	
}

class ATM{
	
	private int accountNum=1111;
	private int password=2222;
	
	private int accN;
	private int pw;
	
	
	public void input() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the accountNum: ");
		 accN = scan.nextInt();
		System.out.println("Enter the password: ");
		 pw = scan.nextInt();
				
	}
	
	public void verify() throws InvalidUserExeption {
		
		if(accountNum==accN && password==pw) {
			
			System.out.println("Welcome to the Application...");
		}
		else {
			
			throw new InvalidUserExeption("Enter the correct Details");
		}
	}
}

class Bank{
	
	public void initiate() {
		
		ATM atm = new ATM();
		try {
				
		atm.input();
		atm.verify();
		
		}
		catch(InvalidUserExeption e){
			
			try {
			System.out.println(e.getMessage()+"last 2 chances");
			atm.input();
			atm.verify();
			}
			catch(InvalidUserExeption f) {
				
				try {
					System.out.println(e.getMessage()+"last 1 chances");
					atm.input();
					atm.verify();
					}
				
				catch(InvalidUserExeption i) {
					System.out.println("Session is done");
				}
			}
			
		}
		
	}
}

public class LaunchCustomEx {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub	
		Bank b = new Bank();
		b.initiate();
		
	}

}


