package com.capgemini.JpaInheritance.person;

import javax.persistence.Entity;

import com.capgemini.JpaInheritance.employee.Employee;

@Entity
public class Person extends Employee{
	private int salary;
	private int bonus;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Person(int employeeId, String employeeName, int salary, int bonus) {
		super(employeeId, employeeName);
		this.salary = salary;
		this.bonus = bonus;
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Person [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
