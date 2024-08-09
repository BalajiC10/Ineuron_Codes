package com.miniprojects;
import java.util.*;

class Rectangle{
	//Project without oops concepts.
	float l;
	float b;
	float area;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter rectangle length");
		l=scan.nextFloat();
		System.out.println("Please enter rectangle breadth");
		b=scan.nextFloat();
	}
	
	void compute() {
		
		area = l*b;
	}
	
	void display() {
		System.out.println("Area of the Rectangle is "+area);
	}
}

class Square{
	
	float l;
	float area;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of Square");
		l=scan.nextFloat();
		
	}
	
	void compute() {
		
		area = l*l;
	}
	
	void display() {
		System.out.println("Area of the Square is "+area);
	}
}

class Circle{

	float r; 
	float area;
	
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter radius of circle");
		r=scan.nextFloat();
		
	}
	
	void compute() {
		
		area = (float) (3.14*r*r);
	}
	
	void display() {
		System.out.println("Area of the Circle is "+area);
	}
}
public class Project1 {
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		rec.input();
		rec.compute();
		rec.display();
		
		Square sq = new Square();
		sq.input();
		sq.compute();
		sq.display();
		
		
		Circle ci = new Circle();
		ci.input();
		ci.compute();
		ci.display();
		
	}

}
