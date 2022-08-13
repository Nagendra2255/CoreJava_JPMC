package com.example.Json.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Json.model.EmployeeModel;
import com.example.Json.model.EmployeeModel1;

public interface EmployeeService_New {

	// Get One Employee
	public Optional<EmployeeModel1> getEmployee(int empId);

	// Get All Employees
	public List<EmployeeModel1> getAllEmployee();

	// Save One Employees
	public EmployeeModel1 saveEmployee(EmployeeModel1 emp1);

	// Save All Employees
	public List<EmployeeModel1> saveAllEmployee(List<EmployeeModel1> emp1);

	// Update One Employee
	public EmployeeModel1 updateEmployee(EmployeeModel1 emp1, Integer empId);

	// Delete One Employee
	public void deleteEmployee(Integer empid);

	// Delete All Employees
	public void deleteAllEmployee();

	// Get Employees by name

	public List<EmployeeModel1> findByEmpName(String empname);

	// Get Employees by city
	public List<EmployeeModel1> findByEmpCity(String city);

}
