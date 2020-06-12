package com.jp.employees.repository;

import org.springframework.data.repository.CrudRepository;

import com.jp.employees.entity.Departments;

public interface DepartmentsRepository  extends CrudRepository<Departments, Integer>{

}