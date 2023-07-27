package com.employee.employee3.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.employee.employee3.model.Employee;
import com.employee.employee3.repo.EmployeeRepository;

import lombok.AllArgsConstructor;
@Configuration
@AllArgsConstructor
public class Springconfig implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;
	public void run(String... args) throws Exception{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", "Doe", 10000));
		employees.add(new Employee("Marry", "Public", 11000));
		employees.add(new Employee("Rahul", "Dravid", 12000));
		employeeRepository.saveAll(employees);
	}

}
