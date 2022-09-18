package com.org.java.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.java.ControllerAdvice.BusinessException;
import com.org.java.ControllerAdvice.EmptyException;
import com.org.java.Models.Employee;
import com.org.java.Repositeries.EmployeeRepository;
import com.org.java.util.Mapper;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	Logger logger= LogManager.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		 logger.info("EmployeeService:addEmployee execution started..");
	        logger.info("EmployeeService:addEmployee request payload {} ", Mapper.mapToJsonString(employee));
		if(employee.getName().isEmpty()||employee.getName().length()==0){
			throw new EmptyException(809,"empty data");
		}
		 logger.info("EmployeeService:addEmployee response  {} ", Mapper.mapToJsonString(employee));
	        logger.info("EmployeeService:addEmployee execution ended..");
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		logger.info("EmployeeService:getEmployee execution started..");
		List<Employee> all = employeeRepository.findAll();
		if(all.isEmpty()){
			throw new BusinessException(205,"ttttessdfdd");
		}
		 logger.info("EmployeeService:getEmployee response  {} ", Mapper.mapToJsonString(all));
	        logger.info("EmployeeService:getEmployee execution ended..");
		return all;
	}

	@Override
	public Employee getAllEmployeeById(int empId) {
		Employee findOne = employeeRepository.findByEmpId(empId);
		if(findOne==null){
			throw new BusinessException(205,"ttttessdfdd");
		}
		
		return findOne;
	}

	@Override
	public List<Integer> getAllEmployeeByAges() {
		// TODO Auto-generated method stub
		List<Integer> list2 = new ArrayList<Integer>();
		List<Employee> list = employeeRepository.findAll();
		List<Integer> allAges = list.stream().map(Employee::getAge).collect(Collectors.toList());
		for (Integer integer : allAges) {
			list2.add(integer);
		}
		return list2;
	}

	@Override
	public Employee getAllEmployeeSalaries() {
		List<Employee> allSalaries = employeeRepository.findAll();
		// List<Double> salaries=
		// allSalaries.stream().map(Employee::getSalary).sorted().collect(Collectors.toList());
		List<Double> salaries = allSalaries.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		// List<Double> salaries2=
		// salaries.stream().sorted((s1,s2)->s1.getSalary()>s2.getSalary()?-1:s1.getSalary()<s2.getSalary()?
		// 1:0).collect(Collectors.toList());
		Employee allSalaries1 = allSalaries.stream()
				.max((s1, s2) -> s1.getSalary() < s2.getSalary() ? -1 : s1.getSalary() > s2.getSalary() ? 1 : 0).get();
		Double salary = allSalaries.stream().mapToDouble(x -> x.getSalary()).summaryStatistics().getMax();
		System.out.println("Max salary by" + salary);
		return allSalaries1;

	}

	@Override
	public Employee getAllEmpoyeeNames(String name) {
		Employee byNames = employeeRepository.findByName(name);
		if(byNames.getName().isEmpty()||byNames.getName().length()==0){
			throw new BusinessException(2054,"ttttessdfdd");
		}
		return byNames;
	}

	@Override
	public List<String> getAllEmpoyeeNames() {
		List<Employee> AllEmployee = employeeRepository.findAll();
		List<String>Names=AllEmployee.stream().map(Employee::getName).collect(Collectors.toList());
		return Names;
	}

}
