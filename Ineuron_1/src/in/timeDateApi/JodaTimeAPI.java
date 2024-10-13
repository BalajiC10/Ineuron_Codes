package in.timeDateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeAPI {
public static void main(String[] args) {
	
		/*
		 * Until java 1.7 version the classes present in java.util package to handle Date & Time (like Date , Calendar, TimeZone)
		 * are not upto the mark wrt convienience and performance
		 * 
		 * 
		 * To overcome this problem in the jaava 1.8 	oracle people introduced Joda-Time API
		 * This API developed by joda.org and available in jav in form of java.time package
		 * 
		 */
		LocalDateTime dt = LocalDateTime.now(); //immutable 
		System.out.println(dt.toString());
		System.out.println("===================");
		LocalDateTime dt1 = LocalDateTime.of(2000, 12,10, 6,23);//user specific info	 //immutable
		System.out.println(dt1); //immutable
		System.out.println(dt1.plusMonths(6));
		System.out.println(dt1.plusHours(5));
		
		System.out.println(dt1.minusMonths(5));
		System.out.println(dt1.minusHours(5));
		
		
		System.out.println("===================");
		LocalDate date = LocalDate.now(); //Current info
		System.out.println(date);
		System.out.println("===================");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd);
		System.out.println(mm);
		System.out.println(yy);
		System.out.println("===================");
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nsec = time.getNano();
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(nsec);
		System.out.println("===================");
		
		ZoneId zone = ZoneId.systemDefault();//to fetch perticular zone	
		System.out.println(zone);
		
		ZonedDateTime zdt = ZonedDateTime.now(zone); //to get date and time of any zone
		System.out.println(zdt);
		
		System.out.println("Another Zone");
		
		ZoneId zoneLA = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zda = ZonedDateTime.now(zoneLA);
		
		System.out.println(zoneLA);
		System.out.println(zda);
}
}
