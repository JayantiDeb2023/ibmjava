package org.courseware.config;

import org.courseware.entity.Course;
import org.courseware.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class config {
private static SessionFactory sessionfactory=null;
private static Session session=null;
public static Session getSession()
{
	sessionfactory=new Configuration().configure().addAnnotatedClass(Course.class).addAnnotatedClass(Student.class).buildSessionFactory();
	session=sessionfactory.openSession();
	return session;
}
}
