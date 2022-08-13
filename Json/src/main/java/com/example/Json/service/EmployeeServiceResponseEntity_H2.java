package com.example.Json.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Json.controller.EmployeeControllerResponseEntity_H2;
import com.example.Json.model.EmployeeModel;
import com.example.Json.model.EmployeeModel1;

import com.example.Json.repository.EmployeeRepositoryResponseEntity_H2;

@Service
public class EmployeeServiceResponseEntity_H2 implements EmployeeService_New {
	List<EmployeeModel1> emp = new ArrayList<EmployeeModel1>();
	@Autowired
	EmployeeModel1 empModel;
	@Autowired
	EmployeeRepositoryResponseEntity_H2 empRepo;
	
	Logger log = LoggerFactory.getLogger(EmployeeServiceResponseEntity_H2.class);

	@Override
	public Optional<EmployeeModel1> getEmployee(int empId) {
		System.out.println("Get Method" + empId);
		// return emp.stream().filter(x->x.getEmpId()==empId).findFirst().get();
		return empRepo.findById(empId);

	}

	@Override
	public List<EmployeeModel1> getAllEmployee() {

		// return emp.stream().filter(x->x.getEmpId()==empId).findFirst().get();
		System.out.println(">>>>>>>" + emp.size());
		return empRepo.findAll();

	}

	@Override
	public EmployeeModel1 saveEmployee(EmployeeModel1 emp1) {
		System.out.println("....save...");

		return empRepo.save(emp1);
	}

	@Override
	public List<EmployeeModel1> saveAllEmployee(List<EmployeeModel1> emp1) {
		System.out.println("SAVE Method" + emp1);
		emp.addAll(emp1);
		return empRepo.saveAll(emp1);

	}

	@Override
	public EmployeeModel1 updateEmployee(EmployeeModel1 emp1, Integer empId) {
		EmployeeModel1 existing = empRepo.findById(empId).orElseThrow(() -> new ResourceNotFoundException());

		if (emp1.getEmpName() != null)
			existing.setEmpName(emp1.getEmpName());
		if (emp1.getEmpCity() != null)
			existing.setEmpCity(emp1.getEmpCity());
		if (emp1.getEmpSalary() != null)
			existing.setEmpSalary(emp1.getEmpSalary());

		return empRepo.save(existing);

	}

	@Override
	public void deleteEmployee(Integer empid) {
		System.out.println("DELETE Method" + empid);
		EmployeeModel1 existing = empRepo.findById(empid).orElseThrow(() -> new ResourceNotFoundException());
		empRepo.deleteById(empid);
		// or
		// Optional<EmployeeModel1> customer = empRepo.findById(empid);
		// if (customer.isPresent()) {
		// empRepo.deleteById(empid);
		// }
	}

	@Override
	public void deleteAllEmployee() {

		empRepo.deleteAll();
	}

	// Get One Employee by name
	@Override
	public List<EmployeeModel1> findByEmpName(String empName) {

		return empRepo.findByEmpName(empName);
	}

	// Get One Employee by city
	@Override
	public List<EmployeeModel1> findByEmpCity(String city) {

		return empRepo.findByEmpCity(city);
	}

}
