package com.employee2.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com.employee2.config.model")
public class SpringConfig {
      @Bean
      public LocalSessionFactoryBean getsession() throws PropertyVetoException
      {
    	  LocalSessionFactoryBean session =new LocalSessionFactoryBean();
    	  session.setHibernateProperties(hibernate());
    	  session.setPackagesToScan("com.employee2.model");
    	  session.setDataSource(datasource());
    	  return session;
      }
      @Bean
      public DataSource datasource() throws PropertyVetoException
      { ComboPooledDataSource con=new ComboPooledDataSource();
        con.setDriverClass("com.mysql.jdbc.Driver");
        con.setJdbcUrl("jdbc:mysql://localhost:3306/hr");
        con.setUser("root");
        con.setPassword("jayanti@2021");
        return con;
      }
      @Bean
      public Properties hibernate()
      {
    	  Properties properties=new Properties();
    	  properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
    	  properties.setProperty("hibernate.hbm2ddl.auto", "update");
    	  properties.setProperty("show_sql", "true");
    	  properties.setProperty("format_sql", "true");
    	  return properties;
      }
}
