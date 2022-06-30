package com.ibm.SpringJDBC1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = 
        	new ClassPathXmlApplicationContext("spring.xml");
        
        CustomerDAO cdao = 
        		ct.getBean("cust",CustomerDAO.class);
    
        Customer c = new Customer(1,"ravi","bng");
        System.out.println(cdao.addCustomer(c));
        
        List<Customer> lc = cdao.getCustomerDetails();
        for(Customer cs : lc) {
        	System.out.println(cs.getId() + "," + cs.getName() 
        	     + "," + cs.getAddress());
        }
    }
}
