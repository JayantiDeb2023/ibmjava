package com.employee.employee3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.employee3.exception.EmployeeNotFoundException;
import com.employee.employee3.model.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);

	List<Employee> listEmployees();

	Optional<Employee> getEmployeeById(int employeeId);
	Employee updateCustomerById(int employeeId, Employee employee);
	String deleteCustomerById(int employeeId);
	List<Employee> findByFirstName(String firstName);
	List<Employee> findByFirstNameOrLastName(String firstName,String lastName);
	List<Employee> findByFirstNameAndLastName(String firstName,String lastName);
}
