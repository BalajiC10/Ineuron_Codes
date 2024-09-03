package com.synchroax;

public class MovieBookApp extends Thread{
	static BookTickets bt; //reference created
	int seat;
	
	public void run() {
		bt.bookSeat(seat);
	}

	public static void main(String[] args) {
		
//		BookTickets bt = new BookTickets();
		bt =new BookTickets();	
		MovieBookApp mv = new MovieBookApp();
		mv.seat=7;
		mv.start();
		
		MovieBookApp mv1 = new MovieBookApp();
		mv1.seat=6;
		mv1.start();
		
	}
}
