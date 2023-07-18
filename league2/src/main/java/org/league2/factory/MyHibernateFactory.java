package org.league2.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.league.entity.LeagueEntity;

public class MyHibernateFactory {
private static SessionFactory sessionFactory=null;
	
	private static Session session=null;
	
	
	public static Session getHibernateSession()throws Exception
	{
		sessionFactory=new Configuration().configure().addAnnotatedClass(LeagueEntity.class).buildSessionFactory();
		
		session=sessionFactory.openSession();
		return session;
	}
}
