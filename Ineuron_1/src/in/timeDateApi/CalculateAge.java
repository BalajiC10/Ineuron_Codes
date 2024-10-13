package in.timeDateApi;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate lc = LocalDate.now();
		
		LocalDate Bday = LocalDate.of(2000, 12, 10);
		
		Period p = Period.between(lc, Bday);
		
		System.out.printf("age is %d years %d months %d",p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		System.out.println("You are "+p.getYears()+" Years today");
		System.out.println(p);
	}

}
