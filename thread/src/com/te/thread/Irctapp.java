package com.te.thread;

public class Irctapp {

	public static void main(String[] args) {
		 TicketBooking ticketBooking = new TicketBooking();
		 User vasami = new User(ticketBooking, 10);
		 User ravi = new User(ticketBooking, 10);
		 User urmuga = new User(ticketBooking, 10);
		 vasami.start();
urmuga.start();
		 ravi.start();
	}

}
