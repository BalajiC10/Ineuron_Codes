package in.timeDateApi;
import java.sql.Date;

public class Launch1 {
public static void main(String[] args) {
	
		/*
		 * Packege 1- java.util.Date - Depricated (Updation is not there for current scenario so go with other class)
		 * Package 2- java.sql.Date 
		 * 
		 */
		//It used for general purpsose like Time and date.
		java.util.Date utildate = new java.util.Date();
		
		System.out.println(utildate); //Sat Oct 12 18:32:38 IST 2024
		
		long hours = utildate.getHours();
		System.out.println(hours);
		
		//it is giving the info of utilDate in milliseconds from 1970
		long time = utildate.getTime();
		System.out.println(time);
		
		//To use Date in DB operations like CRUD query we use in sqlDate
		java.sql.Date sqlDate = new java.sql.Date(hours);
		System.out.println(sqlDate);
		System.out.println();
		java.sql.Date sqlDate1 = new java.sql.Date(time);
		System.out.println(sqlDate1);
}
}
