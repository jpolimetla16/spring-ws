package com.jp.employees.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jp.employees.jaxb.GetEmployeeRequest;
import com.jp.employees.jaxb.GetEmployeeResponse;
import com.jp.employees.repository.EmployeesRepository;


public class EmployeesService {
	
	@Autowired
	private EmployeesRepository employeesRepository;
	
	public GetEmployeeResponse getEmployee(GetEmployeeRequest request) {
		
		return null;
		
	}

}
