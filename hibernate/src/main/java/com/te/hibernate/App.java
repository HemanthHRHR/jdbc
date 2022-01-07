package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("hello world");
//       Team team = new Team();
  //     team.setEmpId(2);
    //   team.setName("heman");
    //   team.setSalary(4754654445.77);
    //   team.setDesignation("dancer");
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
       EntityManager em = emf.createEntityManager(); //creating a object to use persistence
       EntityTransaction transaction = em.getTransaction();
       //deleting the data
       Team vk =em.find(Team.class, 18);
       
       transaction.begin();
       em.remove(vk);
       
  //     em.persist(team);
       transaction.commit();
       
       //updating the data
       Team k1 = em.find(Team.class, 17);
       if(k1!=null) {
    	   k1.setDesignation("vc");
    	   transaction.begin();
    	   transaction.commit();
    	   System.out.println("updated");
       }
       
       
    }
}
