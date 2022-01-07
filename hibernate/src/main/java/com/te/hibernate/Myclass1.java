package com.te.hibernate;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Myclass1 {

	public static void main(String[] args) {
		Girl1 girl1 = new Girl1();
	      girl1.setGid(42);
	      girl1.setName("ash");
	      
	      Boy1 boy1 = new Boy1();
	      boy1.setBid(1);
	      boy1.setBalance(120);
	      boy1.setName("vivek");
	      
	      Boy1 boy2 = new Boy1();
	      boy2.setBid(2);
	      boy2.setBalance(1288);
	      boy2.setName("sallem");
	      
	      
	      Boy1 boy3 = new Boy1();
	      boy3.setBid(3);
	      boy3.setBalance(1646);
	      boy3.setName("sakurkan");
	      
	      List<Boy1> listofboys = Arrays.asList(boy1,boy2,boy3);
	      girl1.setBoys(listofboys);
	    
	      
	      
	      EntityManagerFactory cmf = Persistence.createEntityManagerFactory("students");
	      EntityManager em = cmf.createEntityManager();
	      EntityTransaction transaction = em.getTransaction();
	      transaction.begin();
	      em.persist(boy1);
	      em.persist(boy2);
	      em.persist(boy3);
	      em.persist(girl1);
	      transaction.commit();

	}

}
