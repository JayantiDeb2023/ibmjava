package com.hibernate;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.SpringConfig;
import entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			SessionFactory sessionFactory = context.getBean("sessionFactory", SessionFactory.class);
			Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(new Product(UUID.randomUUID().toString(),"Desktop"));
			session.getTransaction().commit();
			System.out.println("one product created..");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
