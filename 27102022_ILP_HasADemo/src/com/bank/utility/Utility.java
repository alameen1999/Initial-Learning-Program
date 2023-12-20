package com.bank.utility;

import com.bank.entity.Address;
import com.bank.entity.Employee;
import com.bank.service.Service;

public class Utility {

	public static void main(String[] args) {
		
		Employee employee = Service.createEmployee();
		Service.displayEmplyeeDetails(employee);
		

		
		
		

	}

}
