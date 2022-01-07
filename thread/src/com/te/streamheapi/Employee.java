package com.te.streamheapi;

public class Employee {
	int empId;
	String name;
	
	double salary;
	String desgination;
	int age;
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
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee(int empId, String name, double salary, String desgination, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.desgination = desgination;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", desgination=" + desgination
				+ ", age=" + age + "]";
	}
	

}
