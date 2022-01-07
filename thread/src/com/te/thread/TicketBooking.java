package com.te.thread;

public class TicketBooking {
	int tickets= 20;
	String name;
	
	
	public void bookTickets(int noOfTickets ) {
		System.out.println("login sucess");
		System.out.println("login sucess");
		System.out.println("hii"+name);
		synchronized (this) {
		if(tickets<noOfTickets) {
			System.out.println("tickets are banned");
			System.out.println("==============");
		}else {
			System.out.println("tickets are free");
			tickets-=noOfTickets;
			System.out.println("no of tickets"+tickets);
		}
		}
		System.out.println("thank you");
	}

}
