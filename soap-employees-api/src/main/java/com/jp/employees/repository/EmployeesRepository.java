package com.jp.employees.repository;

import org.springframework.data.repository.CrudRepository;

import com.jp.employees.entity.Employees;

public interface EmployeesRepository  extends CrudRepository<Employees, Integer>{

}
