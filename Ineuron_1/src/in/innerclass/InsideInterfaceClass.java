package in.innerclass;



interface Vehicle{
	
	public int getNoOfWheels();
	
	class DefaultVehicle implements Vehicle{

		@Override
		public int getNoOfWheels() {
			// TODO Auto-generated method stub
			return 4;
		}
		
	}
}
class TwoWheeler implements Vehicle{

	@Override
	public int getNoOfWheels() {
		// TODO Auto-generated method stub
		return 2;
	}
	
}

class Bus1 implements Vehicle{
	
	public int getNoOfWheels() {
		return 6;
		
	}
}


public class InsideInterfaceClass<EmailDetails> {

	/*
	 *  class inside a interface :
		We can declare a class inside interface. If a class functionality is closely
		associated with
		the user interface then it is highly recommended to declare class inside
		interface.
		
		In the above example EmailDetails functionality is required for EmailService and we are
		not using anywhereelse . Hence we can declare EmailDetails class inside EmailServiceinterface .
		We can also declare a class inside interface to provide default implementation for that interface.
	 */
	
	public void SendMail(EmailDetails s) {
		
		class EmailDetails{
			
			String from;
			String to;
			String subject;
			
		}
	}
	public static void main(String[] args) {
		Bus1 b1 = new Bus1();
		System.out.println(b1.getNoOfWheels());
		
		Vehicle.DefaultVehicle vd = new Vehicle.DefaultVehicle();
		System.out.println(vd.getNoOfWheels());
		
		/*
		 * In the above example DefaultVehicle in the default implementation of Vehicle
		   interface where as Bus customized implementation of Vehicle interface.
		   The class which is declared inside interface is always static ,hence we can create
           object directly without having outer interface type object.
		 */
	}
}
