package com.te.staticamddefault;

public class Main {

	public static void main(String[] args) {
	Phonecall call = new Maharasatra();
	Phonecall call1 = new Karnataka();
	Phonecall call2 = new Tamilnadu();
	
	call.busymessage();
	call1.busymessage();
	call2.busymessage();
	System.out.println("======================");
	 
	
	call.covidalert();
	call1.covidalert();
	call2.covidalert();
	

	}

}
