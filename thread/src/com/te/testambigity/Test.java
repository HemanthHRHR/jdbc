package com.te.testambigity;

public interface Test {
	default void m1() {
		System.out.println("from test");
	}

}
