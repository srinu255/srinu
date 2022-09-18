package com.org.java.Repositeries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmpId(int empId);

      Employee findByName(String name);

}
