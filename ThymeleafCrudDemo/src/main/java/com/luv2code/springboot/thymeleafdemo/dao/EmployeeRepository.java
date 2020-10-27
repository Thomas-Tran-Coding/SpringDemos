package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

//@RepositoryRestResource(path="members")
// Integer is used because the ID is based on it
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// add a method to sort by last name
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
