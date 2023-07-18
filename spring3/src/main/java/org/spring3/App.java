package org.spring3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Confirguation.SpringConfig;
import Model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfig.class);
        SessionFactory sessionFactory=app.getBean("sessionFactory",SessionFactory.class);
        Session session=sessionFactory.openSession();
        session.getTransaction().begin();
        Product product=new Product(10,"pen",4000.0);
        session.save(product);
        session.getTransaction().commit();
    }
}
