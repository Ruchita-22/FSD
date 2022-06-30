package com.ibm.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext obj = new ClassPathXmlApplicationContext("spring.xml");
        Employee e = obj.getBean("emp",Employee.class);
        System.out.println(e.getName());
        System.out.println(e.getAddress());
        
        Employee e1 = obj.getBean("emp1",Employee.class);
        System.out.println(e1.getName());
        System.out.println(e1.getAddress());
    }
}
