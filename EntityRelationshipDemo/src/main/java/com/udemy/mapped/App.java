package com.udemy.mapped;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		StudentPerson studentPerson = new StudentPerson();
		studentPerson.setAge(29);
		studentPerson.setName("Joe Smith");
		studentPerson.setDrivingLicense("Joe's driving license...");
		
		entityManager.persist(studentPerson);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
