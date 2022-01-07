package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Myclass {

	public static void main(String[] args) {
		Girl girl = new Girl();
      girl.setGid(1);
      girl.setName("ash");
      
      Boy boy = new Boy();
      boy.setBid(101);
      boy.setBalance(1200);
      boy.setName("abhishaqk");
      
      girl.setB(boy);
      
      boy.setGirl(girl);
      EntityManagerFactory cmf = Persistence.createEntityManagerFactory("students");
      EntityManager em = cmf.createEntityManager();
      EntityTransaction transaction = em.getTransaction();
      transaction.begin();
      em.persist(boy);
      em.persist(girl);
      transaction.commit();
      
	}

}
