package org.employee2;

import Model.Employee;
import service.Employeeserviceimpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee a=new Employee(1,"radha",20,"enginner");
        Employeeserviceimpl emp=new Employeeserviceimpl();
        //emp.createEmployee(a);
        Employee e=emp.findEmployee(1);
        System.out.println(e);
        
    }
}
