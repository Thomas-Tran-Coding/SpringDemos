package com.udemy.inheritance;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Car car = new Car("BMW", 100);
		Bus bus = new Bus("Mercedes G Class", 50);
		
		entityManager.persist(car);
		entityManager.persist(bus);
		

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
