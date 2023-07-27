package com.employee3.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages="com.example3.config.model")
public class Springconfig {
	  LocalSessionFactoryBean session=null;
       @Bean
       public LocalSessionFactoryBean getsession()
       {
    	   LocalSessionFactoryBean session=new LocalSessionFactoryBean();
    	   session.setHibernateProperties(hibernateproperties());
    	   session.setDataSource(datasource());
    	   session.setPackagesToScan("com.employee3.model");
    	   return session;
    	   
       }
    @Bean
	public Properties hibernateproperties() {
		Properties hibernate=new Properties();
		hibernate.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		hibernate.setProperty("show_sql","true");
		hibernate.setProperty("format_sql", "true");
		hibernate.setProperty("hbm2ddl.auto", "update");
		return hibernate;
		
	}
    @Bean
	public DataSource datasource()
	{
		ComboPooledDataSource cp=new ComboPooledDataSource();
		cp.setJdbcUrl("jdbc:mysql://localhost:3306/hr");
		cp.setUser("root");
		cp.setPassword("jayanti@2021");
		return cp;
	}
}
