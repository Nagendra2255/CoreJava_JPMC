package com.example.Json.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Json.model.EmployeeModel;
import com.example.Json.service.EmployeeService;
import com.example.Json.service.EmployeeServiceH2;

@RequestMapping("/empControllerH2")
@RestController
public class EmployeeControllerH2 {
	@Autowired
	EmployeeModel emp;
	@Autowired
	EmployeeServiceH2 empService;

	// @GetMapping("/getEmp/{empId}")
	@GetMapping(value = "getEmp/{empId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Optional<EmployeeModel> getEmployee(@PathVariable("empId") int empid) {
		System.out.println("Get employee method" + empid);
		return empService.getEmployee(empid);
	}

	// produces =
	// {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
	// consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
	@GetMapping(value = "getAllEmp")
	public List<EmployeeModel> getAllEmployee() {

		return empService.getAllEmployee();
	}

	@PostMapping("/saveEmp")
	public EmployeeModel saveEmployee(@RequestBody EmployeeModel emp1) {

		empService.saveEmployee(emp1);
		return emp1;
	}

	@PostMapping("/saveAllEmp")
	public List<EmployeeModel> saveAllEmployee(@RequestBody List<EmployeeModel> emp1) {

		empService.saveAllEmployee(emp1);
		return emp1;
	}

	@PutMapping("/updateEmp/{empId}")
	public EmployeeModel updateEmployee(@RequestBody EmployeeModel emp1, @PathVariable("empId") int empId) {

		return empService.updateEmployee(emp1, empId);
	}

	@DeleteMapping("/deleteEmp/{empId}")
	public void deleteEmployee(@PathVariable("empId") Integer empid) {
		System.out.println("DELETE");
		empService.deleteEmployee(empid);
	}

	@DeleteMapping("/deleteAllEmp")
	public void deleteAllEmployee() {
		System.out.println("DELETE");
		empService.deleteAllEmployee();
	}

}
