package com.expample.HibernateSecondApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example1.model.Address;
import com.example1.model.Customer;

//import com.example.model.Department;
//import com.example.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println("Connection started");
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        Session session = factory.openSession();
        System.out.println(factory);

        try
        {
        	/*
        	Department d1 = new Department();
        	d1.setName("IT");
        	
        	Employee e1 = new Employee();
        	e1.setName("John");
        	e1.setDepartment(d1);
        	
        	Employee e2 = new Employee();
        	e2.setName("Peter");
        	e2.setDepartment(d1);
        	
        	session.beginTransaction();
        	session.save(d1);
        	session.save(e1);
        	session.save(e2);
        	*/
        	
        	Customer c1 = new Customer();
        	c1.setName("John");
        	
        	
        	Address ad1 = new Address();
        	ad1.setCity("hyb");
        	ad1.setCustomer(c1);
        	
        	Address ad2 = new Address();
        	ad2.setCity("Gnt");
        	ad2.setCustomer(c1);

        	
        	//c1.setAddress(ad1);
        	
        	session.beginTransaction();
        	session.save(c1);
        	session.save(ad1);
        	session.save(ad2);
        	session.getTransaction().commit();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally
        {
        	session.close();
        	factory.close();
        }
    }
}
