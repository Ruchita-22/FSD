package com.ibm.SpringCore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext a = 
    	new ClassPathXmlApplicationContext("spring.xml");
    	EmpService es =
    			a.getBean("service",EmpService.class);
    	System.out.println(es.getEmpDao());
    	es.getUser("ram");
    	
    }
}
