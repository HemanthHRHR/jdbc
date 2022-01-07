package com.te.testambigity;

public class Demo implements Test,Test2 {

	@Override
	public void m1() {
		System.out.println("from demo");
		Test.super.m1();
	}

}
