package com.udemy.compositionOneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Address address = new Address("Wall Street", 2012);
		
		
		Employee employee = new Employee();
		employee.setEmployeeName("Joffrey");
		
		employee.setAddress(address);
		address.setEmployee(employee);
		
		entityManager.persist(employee);
		entityManager.persist(address);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}