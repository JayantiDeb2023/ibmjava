package com.employee3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.employee3.config.Springconfig;
import com.employee3.model.Employee;

public class EmployeeServiceImpl implements Employeservice{
    ApplicationContext context= new AnnotationConfigApplicationContext(Springconfig.class);
    SessionFactory sessionfactory=context.getBean("getsession",SessionFactory.class);
    Session session=sessionfactory.openSession();
    List<Employee> emp=new ArrayList<Employee>();
	public Employee createEmployee(Employee e) throws SQLException {
		session.save(e);
		return e;
	}

	@Override
	public List<Employee> showallEmployee() {
	     TypedQuery <Employee> query=session.createQuery("From Employee E",Employee.class);
	     List<Employee> a=query.getResultList();
		return a;
	}

	@Override
	public Employee findEmployeebyId(int id) {
		Employee e=session.find(Employee.class, id);
		return e;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(findEmployeebyId(id)!=null)
		{
			session.remove(findEmployeebyId(id));
			System.out.println("done");
		}
		
	}

	@Override
	public Employee updateEmployee(int id, Employee e) {
		if(findEmployeebyId(id)!=null)
		{   Employee e1=findEmployeebyId(id);
		    e1.setEmployeename(e.getEmployeename());
		    e1.setSalary(e.getSalary());
		    session.merge(e);
			System.out.println("done");
		}
		return e;
		
	}

}
