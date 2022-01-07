package com.te.staticamddefault;

public interface Phonecall {
	void busymessage();
	default void covidalert() {
		System.out.println("amithabh baccahan is calinng");
	}

}
