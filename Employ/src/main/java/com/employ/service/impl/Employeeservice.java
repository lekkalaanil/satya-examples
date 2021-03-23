package com.employ.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employ.dao.EmployeeDao;
import com.employ.model.Employee;

@Service
public class Employeeservice {
	@Autowired
	private EmployeeDao employeeDao;

	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}
	
	public Employee getEmployeeById(Integer employeeId)
	{
		return employeeDao.findById(employeeId).get();
	}
}
