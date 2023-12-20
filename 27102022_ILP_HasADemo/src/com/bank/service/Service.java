package com.bank.service;

import com.bank.entity.Address;
import com.bank.entity.Employee;

public class Service {

	public static Employee createEmployee() {
		Address address =  new Address("Trivandrum");
		Employee employee = new Employee("Suneesh",address);
		return employee;
		
	}

	public static void displayEmplyeeDetails(Employee employee) {
		System.out.println("Name"+" "+"City");
		System.out.println(employee.getEmployeeName()+"	"+employee.getAddress().getCity());
		
		
	}
	

}
