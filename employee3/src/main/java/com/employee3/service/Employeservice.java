package com.employee3.service;

import java.sql.SQLException;
import java.util.List;

import com.employee3.model.Employee;

public interface Employeservice {
      public Employee createEmployee(Employee e) throws SQLException;
      public List<Employee> showallEmployee() throws SQLException;
      public Employee findEmployeebyId(int id) throws SQLException;
      public void deleteEmployee(int id) throws SQLException;
      public Employee updateEmployee(int id,Employee e) throws SQLException;
}
