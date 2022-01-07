package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Items {
@Id
private int no;
private String name;
private Double cost;
 
@ManyToOne
private Cart cart;

public Cart getCart() {
	return cart;
	
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Items [no=" + no + ", name=" + name + ", cost=" + cost + ", cart=" + cart + "]";
}

}
