package com.symbiosis.practicejpacache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Company;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	EntityManager em1 = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	 Company c = em.find(Company.class,101);
         System.out.println(c);
         Company c1 = em.find(Company.class,101);
         System.out.println(c1);
         
         Company c2 = em1.find(Company.class,101);
         Company c3 = em1.find(Company.class,105);
         
     
         
         System.out.println(c2);
         System.out.println(c3);
    	
    	em.getTransaction().commit();
    }
}
