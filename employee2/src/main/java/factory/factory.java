package factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Employee;

public class factory {
private static SessionFactory sessionFactory;
public static SessionFactory getsessionFactory()
{
	sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	return sessionFactory;
}
}
