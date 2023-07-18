package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import factory.factory;
import Model.Employee;

public class Employeeserviceimpl implements Employeeservice{
    
	@Override
	public Employee createEmployee(Employee e) {
		SessionFactory sessionFactory1=factory.getsessionFactory();
		Session session=sessionFactory1.openSession();
		session.getTransaction().begin();
		session.save(e);
		session.getTransaction().commit();
		return e;
	}

	@Override
	public Employee findEmployee(int Employeeid) {
		SessionFactory sessionFactory1=factory.getsessionFactory();
		Session session=sessionFactory1.openSession();
		session.getTransaction().begin();
		Employee e=session.find(Employee.class,Employeeid);
		session.getTransaction().commit();
		return e;
	}
     

	@Override
	public void deleteEmployee(Employee e) {
		SessionFactory sessionFactory1=factory.getsessionFactory();
		Session session=sessionFactory1.openSession();
		session.getTransaction().begin();
		session.remove(e);
		session.getTransaction().commit();
		System.out.println("done");
	}

	public void updateEmployee(Employee e,String name,int age,String position) {
		SessionFactory sessionFactory1=factory.getsessionFactory();
		Session session=sessionFactory1.openSession();
		session.getTransaction().begin();
		Employee e1=session.find(Employee.class,e.getEmployee_id());
		e1.setName(name);
		e1.setAge(age);
		e1.setPosition(position);
		session.merge(e1);
		session.getTransaction().commit();
		
		
	}

}
