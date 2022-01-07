package com.te.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
@Id
private int no;
private String name;

@OneToMany(mappedBy = "cart")
private List<Items> items;

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

public List<Items> getItems() {
	return items;
}

public void setItems(List<Items> items) {
	this.items = items;
}

@Override
public String toString() {
	return "Cart [no=" + no + ", name=" + name + ", items=" + items + "]";
}

}
