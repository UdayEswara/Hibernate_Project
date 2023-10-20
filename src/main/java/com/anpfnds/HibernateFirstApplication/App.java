package com.anpfnds.HibernateFirstApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example2.model.Passport;
import com.example2.model.Person;

//import com.example.Student;

//import com.example1.model.Address;
//import com.example1.model.Employee;

/**
 * Hello world!
 *
 */
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
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
        	
        	Person per = new Person();
        	per.setName("John");
        	
        	Passport pp = new Passport();
        	pp.setNumber("BWKE90MK");
        	
        	
        	per.setPassport(pp);
        	pp.setPerson(per);
        	
        	session.beginTransaction();
        	session.save(per);
        	session.save(pp);
        	session.getTransaction().commit();
        	/*
        	Student s1 = new Student();
        	s1.setName("Uday");
        	s1.setMarks(80);
        	session.beginTransaction();
        	session.save(s1);
        	session.getTransaction().commit();
        	
        	
        	
        	Employee e1 = new Employee();
        	e1.setName("Ram");;
        	e1.setSalary(12000);
        	
        	Address a1 = new Address();
        	a1.setStreet("ameerpet");
        	
        	e1.setAddress(a1);
        	a1.setEmployee(e1);
        	
        	session.beginTransaction();
        	session.save(e1);
        	session.getTransaction().commit();
        	
        	Employee r1 = session.get(Employee.class, e1.getId());
        	Address r2 = r1.getAddress();
        	System.out.println("Employee: "+r1.getName());
        	System.out.println("Address: "+r2.getStreet());
        	/*
        	Employee e2 = new Employee();
        	e2.setName("Arjun");
        	e2.setSalary(15000);
        	session.beginTransaction();
        	session.save(e2);
        	session.getTransaction().commit();
        	*/
        	
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally
        {
        	session.close();
        }
    }
}
