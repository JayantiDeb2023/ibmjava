package Confirguation;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = { "org.spring3.Confirguation.model"})
public class SpringConfig {
@Bean
public LocalSessionFactoryBean getLocalSessionFactoryBean()
{
	LocalSessionFactoryBean local= new LocalSessionFactoryBean();
	local.setHibernateProperties(hibernateproperties());
	local.setDataSource(Datasource());
	local.setPackagesToScan("org.spring3.Model");
	return local;
}
public DataSource Datasource()
{
	ComboPooledDataSource data=new ComboPooledDataSource();
	data.setJdbcUrl("jdbc:mysql//localhost:3306/hr");
	data.setUser("root");
	data.setPassword("jayanti@2021");
	return data;
}
public Properties hibernateproperties()
{
	Properties prop=new Properties();
	prop.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
	prop.setProperty("hibernate.hbm2ddl.auto", "update");
	prop.setProperty("hibernate.show_sql","true");
	return prop;
}
}
