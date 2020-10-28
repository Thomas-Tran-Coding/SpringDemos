package com.udemy.jpa;

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

//		Person p1 = new Person("Kevin", "kevin@gmail.com");
//		Person p2 = new Person("James", "jamesin@gmail.com");
//		entityManager.persist(p1);
//		entityManager.persist(p2);
//		Person p = entityManager.find(Person.class, 3);
//		entityManager.remove(p);

//		Person p1 = new Person("Joe", 18);
//		Person p2 = new Person("Adam", 34);
//		Person p3 = new Person("Lina", 52);
//		Person p4 = new Person("Joel", 22);
//		
//		entityManager.persist(p1);
//		entityManager.persist(p2);
//		entityManager.persist(p3);
//		entityManager.persist(p4);

//		Query query = entityManager.createQuery("SELECT p from Person p WHERE p.age > 40");
//		Query query = entityManager.createQuery("SELECT p from Person p WHERE p.name Like '%el'");
//		Query query = entityManager.createQuery("SELECT p from Person p WHERE p.age BETWEEN 20 AND 30");
//		Query query = entityManager.createQuery("SELECT p from Person p ORDER BY p.age ASC");

//		Query query = entityManager.createNativeQuery("SELECT * FROM PERSON_TABLE WHERE age < 40", Person.class);

//		Query query = entityManager.createNamedQuery("person.getAll");

//		TypedQuery<Person> query = entityManager.createNamedQuery("person.getAll", Person.class);

//		TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonById", Person.class);
//		query.setParameter("id", 1);

		TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonByName", Person.class);
		query.setParameter("name", "Joe");

		List<Person> people = query.getResultList();

		for (Person p : people) {
			System.out.println(p);
		}

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
