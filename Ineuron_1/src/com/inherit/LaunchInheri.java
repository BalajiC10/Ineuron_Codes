package com.inherit;

class Plane{
	
	public void fly() {
		
		System.out.println("Plane is flying");
	}
	
	public void takeOff() {
		System.out.println("Plane is taking off ");
	}
	
}

class CargoPlane extends Plane{
	
	public void fly() {
		
		System.out.println("Cargo Plane flies at lower heights");
	}
	
	public void carryGoods() {
		
		System.out.println("Cargo Plane Carries Goods");
	}
}

class PassengerPlane extends Plane{
	
	
	public void fly() {
		System.out.println("Passenger plane flies at medium heights");
	}
	
	public void carryPass() {
		System.out.println("Passenger plane carries passengers");
	}
}
public class LaunchInheri {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.carryGoods(); //Special method (which is not present in parent class)
		cp.fly(); //Overriden method (which is modified from parent class method)
		cp.takeOff();//Inherited method (No modification only inherited and using it in child class)
		System.out.println("------------------------------------------------");
		PassengerPlane pp = new PassengerPlane();
		pp.fly();
		pp.carryPass();
		pp.takeOff();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Casting");
		//Which means as Parent class can access the child special methods as acting like child
		Plane p = new CargoPlane();
		p.fly();
		p.takeOff();
	  //p.carryGoods(); THis is not possible you have to downcast it.
		((CargoPlane)p).carryGoods();
		
	
		
	}
}
