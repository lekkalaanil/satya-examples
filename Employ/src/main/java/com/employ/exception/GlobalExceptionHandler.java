package com.employ.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(EmployeeNotFoundException.class)  
	public final ResponseEntity<Object> handleUserNotFoundExceptions(EmployeeNotFoundException exception)  
	{  
	return new ResponseEntity<Object>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);  
	}   

}
