package com.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "lastName", "name", "zipcode", "city", "color" })
@Entity
@Table(name="customer")
public class Customer {


	@Column(name="first_name")
	private String name;

	@Column(name="last_name")
	private String lastName;

	@Column(name="zipcode")
	private int zipcode;

	@Column(name="city")
	private String city;

	@Column(name="color")
	@OneToOne(mappedBy = "employee")
	private String color;

	public Customer() {
		
	}
	
	
	public Customer(String name, String lastName, int zipcode, String city, String color) {
		this.name = name;
		this.lastName = lastName;
		this.zipcode = zipcode;
		this.city = city;
		this.color = color;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Customer {"+ " lastName=" + lastName + ", name=" + name + ", zipcode=" + zipcode
				+ ", city=" + city + ", color=" + color + "}";
	}

}
