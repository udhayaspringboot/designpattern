package com.structural.internal;

public class Main {

	public static void main(String[] args) {

Employee emp = new Employee();
Department dept = new EmpAdapter();
emp.setDept(dept);
emp.empName("hai udhay");
		

	}

}
