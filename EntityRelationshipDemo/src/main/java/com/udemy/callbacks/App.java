package com.udemy.callbacks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.udemy.compositionManyToMany.Professor;
import com.udemy.compositionManyToMany.ResearchProject;


public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Article article = new Article("Albert Einstein - Warhammer");
		
		entityManager.persist(article);
		
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}