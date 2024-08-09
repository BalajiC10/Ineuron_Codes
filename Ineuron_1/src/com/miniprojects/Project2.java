package com.miniprojects;

import java.util.Scanner;

abstract class Shapes{
	//Project using Oops concepts.
	float area;
	
	abstract void input();
	
	abstract void compute();
	
	abstract void display();
	
}

class Rectangle1 extends Shapes{

	float l;
	float b;
	
	@Override
	void input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter rectangle length");
		l=scan.nextFloat();
		System.out.println("Please enter rectangle breadth");
		b=scan.nextFloat();
	}

	@Override
	void compute() {
		// TODO Auto-generated method stub
		area = l*b;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of the Rectangle is "+area);
	}
	
	
}

class Square1 extends Shapes{

	float l;
	
	@Override
	void input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of Square");
		l=scan.nextFloat();
	}

	@Override
	void compute() {
		// TODO Auto-generated method stub
		area = l*l;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of the Square is "+area);
	}
	
	
}

class Circle1 extends Shapes{

	static float pi =(float) 3.14;
	float r;
	@Override
	void input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter radius of circle");
		r=scan.nextFloat();
	}

	@Override
	void compute() {
		
		area = (float) (3.14*r*r);
	}
	
	void display() {
		System.out.println("Area of the Circle is "+area);
	}	
	
	
}

class Geometry{
	
	public void permit(Shapes s) {
		
		s.input();
		s.compute();
		s.display();
	}
}
public class Project2 {
	
	public static void main(String[] args) {
		Rectangle1 rec = new Rectangle1();
		Square1 sq = new Square1();	
		Circle1 ci = new Circle1();
		
		Geometry gm = new Geometry();
		gm.permit(rec);
		System.out.println("--------------------------------");
		gm.permit(sq);
		System.out.println("--------------------------------");
		gm.permit(ci);
		System.out.println("--------------------------------");
		
	}

}
