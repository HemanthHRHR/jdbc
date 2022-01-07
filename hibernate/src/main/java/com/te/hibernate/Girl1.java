package com.te.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Girl1 {
@Id
private int gid;
private String name;

@OneToMany
private List<Boy1> boys;

public int getGid() {
	return gid;
}

public void setGid(int gid) {
	this.gid = gid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Boy1> getBoys() {
	return boys;
}

public void setBoys(List<Boy1> boys) {
	this.boys = boys;
}

@Override
public String toString() {
	return "Girl1 [gid=" + gid + ", name=" + name + ", boys=" + boys + "]";
}


}
