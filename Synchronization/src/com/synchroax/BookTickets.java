package com.synchroax;

public class BookTickets {

	int total_seats=10;
	
	synchronized void bookSeat(int seat) {

		if(seat<=total_seats) {
			
			System.out.println(seat+" Seats Booked");
			total_seats =total_seats-seat;
			System.out.println("Seats Left "+total_seats);
		}
		else {
			
			System.out.println("HouseFull");
			System.out.println("Seats Left " +total_seats);
		}
	}

}
