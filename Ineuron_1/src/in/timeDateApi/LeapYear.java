package in.timeDateApi;

import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer data = Integer.parseInt(args[0]); //Should pass from terminal throws arrayindexexception
		
		int data = 2000;
		
		Year year = Year.of(data);
		
		if(year.isLeap()) {
			System.out.println(data+" Leap year");
		}
		else {
			System.out.println(data+" Not a Leap Year");
		}
	}

}
