package com.statick;
import java.util.*;

public class Example {

	private float pa;
	private float td;
	private float si;
	
	private static float fi=2.5f;//it will store in class only once
	//we can initilize static variable where object will be common among the all object.
	
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dear, Kindly enter loan amount needed:");
		pa=scan.nextFloat();//this will keep changing and storing in different object
		
		System.out.println("Dear, Kindly enter time you needed");
		td = scan.nextFloat();
		
		
	}
	
	public void compute() {
		si=(pa*td)/fi;
	}
	
	public void displ() {
		System.out.println("Si of "+si);
	}
	
	public static void main(String[] args) {
		Example en = new Example();
		en.acceptInput();
		en.displ();
		
	}
}
