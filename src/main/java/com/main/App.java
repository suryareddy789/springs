package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import impl.Customer;

public class App
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"SpringBeans.xml"});

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
    }
}