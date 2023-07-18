package com.jdbc;

/**
 * Hello world!
 *
 */
import config.Springconfig;
import dao.cardao;
import Model.Car;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.cj.xdevapi.Result;


public class App 
{
    public static void main( String[] args )
    {
    	try {

			ApplicationContext context = new AnnotationConfigApplicationContext(Springconfig.class);
			cardao carDao = context.getBean("carDao", cardao.class);
			/*
			 * Car c = carDao.createCar(new Car(105, "mahindra scorpio"));
			 * System.out.println(c);
			 */
			
			List<Car> cars=carDao.getallCars();
			for(Car c:cars)
			{
				System.out.println(c);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
