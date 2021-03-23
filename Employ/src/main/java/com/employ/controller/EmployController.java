package com.employ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employ.exception.EmployeeNotFoundException;
import com.employ.model.Employee;
import com.employ.service.impl.Employeeservice;

@RestController
@RequestMapping("employ")
public class EmployController {

	@Autowired
	private Employeeservice employeeService;

	@PostMapping
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.OK);

	}

	@GetMapping("{employeeId}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable Integer employeeId) throws EmployeeNotFoundException {
		Employee employee = employeeService.getEmployeeById(employeeId);
		if (employee == null) {
			throw new EmployeeNotFoundException("Employee not found with id:" + employeeId);
		} else {
			return new ResponseEntity<Object>(employee, HttpStatus.OK);
		}
	}

}
