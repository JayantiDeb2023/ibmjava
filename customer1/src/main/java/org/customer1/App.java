package org.customer1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Employee;
import antlr.debug.NewLineEvent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(new Employee(100,"radha",20));
        session.find(Employee.class, 10);
        session.getTransaction().commit();
    }
}
