package com.structural.internal;

public class Employee {
	
	private Department dept;
	

	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public void empName(String str)
	{
		dept.deptName(str);
		System.out.println(str);
	}
}
