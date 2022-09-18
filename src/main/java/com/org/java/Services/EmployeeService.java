package com.org.java.Services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.org.java.Models.Employee;

@Service
public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();

	Employee getAllEmployeeById(int empId);

	List<Integer> getAllEmployeeByAges();

	Employee getAllEmployeeSalaries();

	Employee getAllEmpoyeeNames(String name);

	List<String> getAllEmpoyeeNames();

}
