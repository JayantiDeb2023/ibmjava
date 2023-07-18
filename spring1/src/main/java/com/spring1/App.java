package com.spring1;
import Model.Coach;
import Model.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    Coach myCoach=context.getBean("theCoach",Coach.class);
    System.out.println(myCoach.getDailyWorkOut());
    System.out.println(myCoach.getDailyFortune());
    
    Person person=context.getBean("Person",Person.class);
    System.out.println(person);
    }
}
