package service;

import Model.Employee;

public interface Employeeservice {
     public Employee createEmployee(Employee e);
     public Employee findEmployee(int Employeeid);
     public void deleteEmployee(Employee e);
     public void updateEmployee(Employee e,String name,int age,String position);
}
