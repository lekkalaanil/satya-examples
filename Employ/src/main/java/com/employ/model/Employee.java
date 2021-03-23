package com.employ.model;


import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {
	
	@Id
	private Integer employeeId;
	@NotNull(message = "Employee name should not be null")
	private String employeeName;
	@NotNull(message = "Employee department should not be null")
	private String department;
	@NotNull(message = "Employee salary should not be null")
	private Long salary;
	
}
