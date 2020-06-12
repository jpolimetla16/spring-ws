package com.jp.employees.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Departments {
	
	@Id
	private Integer departmentId;
	private String departmentName;
	
	@OneToMany(mappedBy="department")
	private List<Employees> employees;
	

}
