package com.te.hibernate;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setNo(40);
		cart.setName("flipkart");
		
		Items items = new Items();
		items.setNo(70);
		items.setName("shoes");
		items.setCost(5600.0);
		
		Items items2 = new Items();
		items2.setNo(71);
		items2.setName("tshirt");
		items2.setCost(6575.8);
		
		Items items3 = new Items();
		items3.setNo(72);
		items3.setName("pants");
		items3.setCost(56655.8);
		
		List<Items> listofitems = Arrays.asList(items,items2,items3);
		cart.setItems(listofitems);
		items.setCart(cart);
		items2.setCart(cart);
		items3.setCart(cart);
		
		EntityManagerFactory cmf = Persistence.createEntityManagerFactory("students");
	      EntityManager em = cmf.createEntityManager();
	      EntityTransaction transaction = em.getTransaction();
	      transaction.begin();
	      em.persist(items);
	      em.persist(items2);
	      em.persist(items3);
	      em.persist(cart);
	      transaction.commit();


	}

}
