package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Team {
	@Id
	private int empId;
	 private String name;
	 private double salary;
	 private String designation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Team [empId=" + empId + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	 

}
