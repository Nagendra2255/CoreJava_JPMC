package com.example.Json.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Json.model.EmployeeModel1;

import com.example.Json.service.EmployeeService_New;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping("/empControllerResponseEntityH2")
@RestController
//@Controller
//@PropertySource("classpath:own.properties")
public class EmployeeControllerResponseEntity_H2 {
	@Autowired
	EmployeeModel1 emp;
	@Autowired
	EmployeeService_New empService;
	@Value("${title}")
	String name;
	@Value("${password}")
	String password;
	@Autowired
	Environment env;
	//@Value("${myown}")
	//String own;
	
	
	Logger log = LoggerFactory.getLogger(EmployeeControllerResponseEntity_H2.class);

	@GetMapping(value = "getEmp/{empId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Optional<EmployeeModel1>> getEmployee(@PathVariable("empId") int empid) {
		System.out.println("Get employee method" + empid);
		log.info("Get One employee record:="+empid);
		log.info("Get One employee record:="+name+password);
		log.info("Get One employee record:="+env.getProperty("cityname"));
		//log.info("Get One employee record:="+own);
		return new ResponseEntity(empService.getEmployee(empid), HttpStatus.OK);
	}

	@GetMapping(value = "getAllEmp")
	public ResponseEntity<List<EmployeeModel1>> getAllEmployee() {

		log.info("Get All employee records");
		return new ResponseEntity(empService.getAllEmployee(), HttpStatus.OK);
	}

	@PostMapping("/saveEmp")
	public ResponseEntity<EmployeeModel1> saveEmployee(@RequestBody EmployeeModel1 emp1) {

		log.info("Insert one employee record");
		return new ResponseEntity(empService.saveEmployee(emp1), HttpStatus.CREATED);
	}

	@PostMapping("/saveAllEmp")
	public ResponseEntity<List<EmployeeModel1>> saveAllEmployee(@RequestBody List<EmployeeModel1> emp1) {
		
		log.info("Insert all employee records");

		empService.saveAllEmployee(emp1);
		return new ResponseEntity(empService.saveAllEmployee(emp1), HttpStatus.CREATED);
	}

	@PutMapping("/updateEmp/{empId}")
	public ResponseEntity<EmployeeModel1> updateEmployee(@RequestBody EmployeeModel1 emp1,
			@PathVariable("empId") int empId) {

		log.info("Update one employee record");
		return new ResponseEntity(empService.updateEmployee(emp1, empId), HttpStatus.OK);
	}

	@DeleteMapping("/deleteEmp/{empId}")
	public ResponseEntity<EmployeeModel1> deleteEmployee(@PathVariable("empId") Integer empid) {
		log.info("Delete one employee record");
		empService.deleteEmployee(empid);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/deleteAllEmp")
	public ResponseEntity<List<EmployeeModel1>> deleteAllEmployee() {
		log.info("Delete all employee records");
		empService.deleteAllEmployee();
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@GetMapping(value = "/getEmployeeByName/{empname}")
	public List<EmployeeModel1> findByEmpName(@PathVariable("empname") String empname) {
		log.info("Get employees records by name");
		return empService.findByEmpName(empname);
	}

	@GetMapping(value = "/getEmployeeByCity/{city}")
	public List<EmployeeModel1> findByEmpCity(@PathVariable("city") String city) {
		log.info("Get employees records by city");
		return empService.findByEmpCity(city);
	}

}
