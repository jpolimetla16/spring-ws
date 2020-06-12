package com.jp.employees.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Employees {
	
	@Id
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Double salary;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Departments department;
	

}
