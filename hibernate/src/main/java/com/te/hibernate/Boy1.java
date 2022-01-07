package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boy1 {
	@Id
	private int bid;
	private String name;
	private double balance;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Boy1 [bid=" + bid + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
