package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	       EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
	       EntityManager em = emf.createEntityManager();
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
