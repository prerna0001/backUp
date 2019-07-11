package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! You are in main" );
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml"); //making reference of Application context interface of ClassPathXmlApplicationContext
        Customer customer= (Customer) applicationContext.getBean("customer");
    }
}
