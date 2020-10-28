package com.udemy.compositionManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.udemy.compositionOneToOne.Address;
import com.udemy.compositionOneToOne.Employee;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		School university = new School("OTH Regensburg");
		Pupil s1 = new Pupil("Joe Lester");
		s1.setSchool(university);

		Pupil s2 = new Pupil("Thomas Tran");
		s2.setSchool(university);
		
		entityManager.persist(university);
		entityManager.persist(s1);
		entityManager.persist(s2);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}