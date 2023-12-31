package com.employee.employee3.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.employee3.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query
	List<Employee> findByFirstName(String firstName);
	@Query
	List<Employee> findByFirstNameOrLastName(String firstName,String lastName);
	@Query
	List<Employee> findByFirstNameAndLastName(String firstName,String lastName);
}
