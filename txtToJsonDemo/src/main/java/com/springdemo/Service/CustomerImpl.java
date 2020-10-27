package com.springdemo.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.springdemo.entity.Customer;


@Service
public class CustomerImpl implements CustomerService {

	private EntityManager entityManager;

	public CustomerImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}

	public List<Customer> readCustomer() {
		String file = "C:\\Users\\Thomas Tran\\Desktop\\Studium\\Java Udemy Kurs\\Vaadin Udemy Kurs\\Vaadin Projekte\\Assessment\\Assessment\\src\\main\\resources\\data.csv";
		List<Customer> customers = new ArrayList<Customer>();
		Path pathToFile = Paths.get(file);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {

			// read the first line from text file
			String line = br.readLine();

			// loop until all line are read
			while (line != null) {

				String name;
				String lastName;
				int zipCode;
				String city;
				String color;

				// use string.split to load a string array with
				// the values from each line of the file
				// if line doesnt contain 5 attributes -> continue
				String[] attributes = line.strip().split(",");
				if (attributes.length < 4) {
					line = line + br.readLine();
					continue;
				}
				// Splitting the line in attributes
				name = attributes[0].replaceAll("\\s+", "");
				lastName = attributes[1].replaceAll("\\s+", "");
				zipCode = Integer.parseInt(attributes[2].replaceAll("\\s+", "").substring(0, 5));
				city = attributes[2].substring(7);
				color = attributes[3].replaceAll("\\s+", "");

				Customer customer = new Customer(name, lastName, zipCode, city, color);
				customers.add(customer);

				line = br.readLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return customers;
	}

}
