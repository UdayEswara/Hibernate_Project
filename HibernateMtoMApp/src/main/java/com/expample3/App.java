package com.expample3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.expample3.model.Cart;
import com.expample3.model.Product;

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
        	Product p1 = new Product();
        	p1.setName("Hp_laptop");
        	
        	Product p2 = new Product();
        	p2.setName("Dell_laptop");
        	
        	Product p3 = new Product();
        	p3.setName("Mi_laptop");
        	
        	
        	Cart c1 = new Cart();
        	Cart c2 = new Cart();
        	Cart c3 = new Cart();
        	
        	
        	p1.getCart().add(c1);
        	p1.getCart().add(c3);
        	p2.getCart().add(c2);
        	p3.getCart().add(c1);
        	p3.getCart().add(c2);
        	p3.getCart().add(c3);
        	
        	session.beginTransaction();
        	session.save(p1);
        	session.save(p2);
        	session.save(p3);
        	session.save(c1);
        	session.save(c2);
        	session.save(c3);
        	session.getTransaction().commit();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
