package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
		EntityManager em = emf.createEntityManager();
		Team player = em.find(Team.class, 18);
		System.out.println(player);

	}

}
