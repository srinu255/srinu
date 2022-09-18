package com.org.java.Controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.Models.Employee;
import com.org.java.Services.EmployeeService;
import com.org.java.util.Mapper;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	 Logger logger= LogManager.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		logger.info("EmployeeController:placeOrder persist Employee request {}", Mapper.mapToJsonString(employee));
		Employee emp = employeeService.saveEmployee(employee);
		logger.info("EmployeeController:placeOrder response from service {}", Mapper.mapToJsonString(employee));
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmpLoyee() {
		List<Employee> getAll = employeeService.getAllEmployee();
		logger.info("OrderController:getOrders response from service {}", Mapper.mapToJsonString(getAll));
		return new ResponseEntity<>(getAll, HttpStatus.OK);
	}
	
	@GetMapping("/byId/{empId}")
	public ResponseEntity<Employee> getEmpLoyeeById(@PathVariable("empId") int empId) {
		Employee getId = employeeService.getAllEmployeeById(empId);
		
		return new ResponseEntity<>(getId, HttpStatus.OK);
	}
	@GetMapping("/allAges")
	public ResponseEntity<List<Integer>> getEmpLoyeeByAllAges() {
		List<Integer> getAllAges = employeeService.getAllEmployeeByAges();
		return new ResponseEntity<>(getAllAges, HttpStatus.OK);
	}
	@GetMapping("/allEmpSalaries")
	public ResponseEntity<Employee> getEmpLoyeeByAllEmpoyeeSalaries() {
		Employee allSalaries = employeeService.getAllEmployeeSalaries();
		return new ResponseEntity<>(allSalaries, HttpStatus.OK);
	}
	@GetMapping("/byName/{name}")
	public ResponseEntity<Employee> getEmpLoyeeByAllEmpoyeeNames(@PathVariable("name") String name) {
		Employee EmpoyeeNames = employeeService.getAllEmpoyeeNames(name);
		return new ResponseEntity<>(EmpoyeeNames, HttpStatus.OK);
	}
	@GetMapping("/allEmployeeNames")
	public ResponseEntity<List<String>> getAllEmpLoyeeByAllEmpoyeeNames() {
		List<String> EmpoyeeNames = employeeService.getAllEmpoyeeNames();
		return new ResponseEntity<>(EmpoyeeNames, HttpStatus.OK);
	}
	

}
