package com.employee3;

import java.sql.SQLException;

import com.employee3.model.Employee;
import com.employee3.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       EmployeeServiceImpl a=new EmployeeServiceImpl();
       Employee b=new Employee("radha",4000);
       Employee b1=a.createEmployee(b);
       System.out.println(b1);
    }
}
