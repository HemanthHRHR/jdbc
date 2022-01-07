package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {

	public static void main(String[] args) {
	 EntityManagerFactory emf= Persistence.createEntityManagerFactory("students");
	 EntityManager cem = emf.createEntityManager();
//	 String query ="from Team";
//	 Query createqery = cem.createQuery(query);
//	 List<Team> reultlist =createqery.getResultList();
//	 for(Team team:reultlist) {
//		 System.out.println(team);
//	 }
	 String query1 = " Select min(salary) from Team";
	 
	Query createQuery2 = cem.createQuery(query1);
	 Double singleresult = (Double)createQuery2.getSingleResult();
	 System.out.println(singleresult);
	// Object singleresult1 = createQuery.getSingleResult();
	// System.out.println(singleresult1);
	 
	 
	 EntityTransaction transaction = cem.getTransaction();
	 String query2 ="update Team set salary=150 where empId=33";
	 transaction.begin();
	 Query  createQuery = cem.createQuery(query2);
	 int excuteUpdate = createQuery.executeUpdate();
	 transaction.commit();
	 
	 
	 String query3 ="delete from Team  where empId=17";
	 transaction.begin();
	 Query  createQuery1 = cem.createQuery(query3);
	 int excuteUpdate1 = createQuery1.executeUpdate();
	 transaction.commit();
	 
	}

}
