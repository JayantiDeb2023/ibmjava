package com.employee.employee3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employee.employee3.model.Customer;
import com.employee.employee3.model.Employee;
import com.employee.employee3.repo.EmployeeRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private final EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub

		Optional<Employee> emOptional = employeeRepository.findById(employeeId);
		if (emOptional==null) {
			return null;
		} else {
			return emOptional;
		}
	}
	public Employee updateCustomerById(int employeeId, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee>employee2=employeeRepository.findById(employeeId);
		if (employee2!=null) {
		@SuppressWarnings("deprecation")
		Employee employee3=employeeRepository.getById(employeeId);
		employee3.setFirstname(employee.getFirstname());
		employee3.setLastname(employee.getFirstname());
		employee3.setSalary(employee.getSalary());
		employeeRepository.save(employee3);
		return employee;
		}
		return null;
	}

	@Override
	public String deleteCustomerById(int employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
		return "done";

	}
	@Override
	public List<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		List<Employee> employees=employeeRepository.findByFirstName(firstName);
		if(employees==null)
		{
			return null;
		}
		else
		{
			return employees;
		}
		
	}

	@Override
	public List<Employee> findByFirstNameOrLastName(String firstName, String lastName) {
		List<Employee> employees=employeeRepository.findByFirstNameOrLastName(firstName, lastName);
		if(employees==null)
		{
			return null;
		}
		else
		{
			return employees;
		}}
	
		@Override
		public List<Employee> findByFirstNameAndLastName(String firstName, String lastName) {
			List<Employee> employees=employeeRepository.findByFirstNameAndLastName(firstName, lastName);
			if(employees==null)
			{
				return null;
			}
			else
			{
				return employees;
			}	
	}
}
