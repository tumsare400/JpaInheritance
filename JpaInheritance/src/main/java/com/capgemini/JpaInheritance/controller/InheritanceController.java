package com.capgemini.JpaInheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.JpaInheritance.dao.EmployeeDao;
import com.capgemini.JpaInheritance.employee.Employee;
import com.capgemini.JpaInheritance.person.Person;

@RestController
public class InheritanceController {

	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/")
	public void set() {
				Employee employee=new Person(101,"RAM", 20000, 200);
				dao.save(employee);
				
				
				
			}
	@RequestMapping("/get")
	public Employee get() {
		
		return dao.findById(101).get();
		
	}
}
