package com.te.thread;

public class User extends Thread {
	TicketBooking book;
	int noOfTickets;
	
	

	public User(TicketBooking book, int noOfTickets) {
		super();
		this.book = book;
		this.noOfTickets = noOfTickets;
	}
	@Override
	public void run() {
		book.bookTickets(noOfTickets);
	}

}
