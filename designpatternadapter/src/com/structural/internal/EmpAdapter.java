package com.structural.internal;

import com.structural.external.EmployeeService;

public class EmpAdapter implements Department{
//using composition to perform adapter
	EmployeeService empServ = new EmployeeService();
	@Override
	public void deptName(String str) {
		empServ.serviceOne(str);
		
	}
	
	

}
