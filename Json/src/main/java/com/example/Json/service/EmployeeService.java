package com.example.Json.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Json.model.EmployeeModel;

@Service
public class EmployeeService {
	List<EmployeeModel> emp = new ArrayList<EmployeeModel>();
	@Autowired
	EmployeeModel empModel;

	public EmployeeModel getEmployee(Integer empId) {
		System.out.println("Get Method" + empId);
		// return emp.stream().filter(x->x.getEmpId()==empId).findFirst().get();
		return emp.get(empId);

	}

	public List<EmployeeModel> getAllEmployee() {

		// return emp.stream().filter(x->x.getEmpId()==empId).findFirst().get();
		System.out.println(">>>>>>>" + emp.size());
		return emp;

	}

	public EmployeeModel saveEmployee(EmployeeModel emp1) {
		System.out.println("SAVE Method" + emp1);
		emp.add(emp1);
		return emp1;
	}

	public List<EmployeeModel> saveAllEmployee(List<EmployeeModel> emp1) {
		System.out.println("SAVE Method" + emp1);
		emp.addAll(emp1);
		return emp1;
	}

	public void updateEmployee(EmployeeModel emp1) {
		System.out.println("PUT Method" + emp1);

	}

	public void deleteEmployee(Integer empid) {
		System.out.println("DELETE Method" + empid);
		emp.remove(empid);
	}

}
