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
import com.example.Json.repository.EmployeeRepository;

@Service
public class EmployeeServiceH2 {
	List<EmployeeModel> emp = new ArrayList<EmployeeModel>();
	@Autowired
	EmployeeModel empModel;
	@Autowired
	EmployeeRepository empRepo;

	public Optional<EmployeeModel> getEmployee(int empId) {
		System.out.println("Get Method" + empId);
		// return emp.stream().filter(x->x.getEmpId()==empId).findFirst().get();
		return empRepo.findById(empId);

	}

	public List<EmployeeModel> getAllEmployee() {

		// return emp.stream().filter(x->x.getEmpId()==empId).findFirst().get();
		System.out.println(">>>>>>>" + emp.size());
		return empRepo.findAll();

	}

	public EmployeeModel saveEmployee(EmployeeModel emp1) {

		return empRepo.save(emp1);
	}

	public List<EmployeeModel> saveAllEmployee(List<EmployeeModel> emp1) {
		System.out.println("SAVE Method" + emp1);
		emp.addAll(emp1);
		return empRepo.saveAll(emp1);

	}

	public EmployeeModel updateEmployee(EmployeeModel emp1, Integer empId) {
		EmployeeModel existing = empRepo.findById(empId).orElseThrow(() -> new ResourceNotFoundException());

		// existing.setEmpId(emp1.getEmpId());
		existing.setEmpName(emp1.getEmpName());
		existing.setEmpCity(emp1.getEmpCity());
		existing.setEmpSalary(emp1.getEmpSalary());

		return empRepo.save(existing);

	}

	public void deleteEmployee(Integer empid) {
		System.out.println("DELETE Method" + empid);
		EmployeeModel existing = empRepo.findById(empid).orElseThrow(() -> new ResourceNotFoundException());
		empRepo.deleteById(empid);
	}

	public void deleteAllEmployee() {

		empRepo.deleteAll();
	}

}
