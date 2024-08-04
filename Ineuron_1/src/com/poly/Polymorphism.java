package com.poly;

class Plane1 {
	
	public void fly() {
		System.out.println("Plane is flying");
		
	}
	
	public void takeOff() {
		
		System.out.println("Plane is taking Off");
		
	}
}

class CargoPlane extends Plane1{
	
	public void fly() {
		System.out.println("Cargo Plane flies in at lower heights");
		
	}
	public void takeOff() {
		
		System.out.println("Cargo Plane requires longer runway");
		
	}
	
}
class PassengerPlane extends Plane1{
	
	public void fly() {
		System.out.println("Passener Plane flies in at medium heights");
		
	}
	public void takeOff() {
		
		System.out.println("Passener Plane requires medium runway");
		
	}
	
}

class FighterPlane extends Plane1{
	
	public void fly() {
		System.out.println("Flighter Plane flies in at Higher heights");
		
	}
	public void takeOff() {
		
		System.out.println(" Flighter Passener Plane requires small runway");
		
	}
	
}

class Airport{
	
	//Polymoprhism means one in many forms.
	
	public void permit(Plane1 p) {
		p.fly();
		p.takeOff();
		
	}
}



public class Polymorphism {

	public static void main(String[] args) {
			
		CargoPlane cp = new CargoPlane();
		cp.fly();
		cp.takeOff();
		System.out.println("this needs so much time by creating object of every class and calling methods");
		PassengerPlane pp = new PassengerPlane();
		pp.fly();
		pp.takeOff();
		
		System.out.println("-----------Polymorphism--------------------------------");
		
		Airport ap = new Airport();
		ap.permit(cp);
		ap.permit(pp);
		
	}
}
