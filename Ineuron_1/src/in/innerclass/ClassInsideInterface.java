package in.innerclass;


class VehicleType{
	
	interface Vehiclex{
		public int getNoOfWheels();
	}
}
class Bus implements in.innerclass.VehicleType.Vehiclex{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}

class Auto implements in.innerclass.VehicleType.Vehiclex{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}

public class ClassInsideInterface {
	//interface inside a class
	//We can declare interface inside a class
	interface Demo{
	
		/*
		 * Inside class if we required multiple implementation of an interface and these
		   implementations of relevant to a particular class, then we should declare interface
           inside a class.
		 */
	}
}
