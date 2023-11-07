package com.expample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.expample1.model.User;

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
        	/*User u1 = new User();
        	u1.setName("john");
        	u1.setAge(20);*/
        	//Insert user details
        	User u2 = new User();
        	u2.setName("uday");
        	u2.setAge(21);
        	
        	User u3 = new User();
        	u3.setName("Ram");
        	u3.setAge(19);
        	
        	session.beginTransaction();
        	session.save(u2);
        	session.save(u3);
        	//Retrieve
        	
        	User u4 = session.get(User.class,2);
        	System.out.println("User Name: "+u4.getName()+"\t User Age : "+u4.getAge());
        	session.save(u4);
        	
        	//Update 
        	User u5 = session.get(User.class,3);
        	u5.setAge(20);
        	session.update(u5);
        	session.save(u5);
        	
        	//Delete
        	User u6 = session.get(User.class,3);
        	session.delete(u6);
        	
        	session.getTransaction().commit();
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
