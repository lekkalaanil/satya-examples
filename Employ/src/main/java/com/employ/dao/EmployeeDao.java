package com.employ.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employ.model.Employee;

@Repository
public interface EmployeeDao extends MongoRepository<Employee, Integer> {

}
