package com.example.Json.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Json.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
//public List<EmployeeModel> findByCity(String city);
	
	public List<EmployeeModel> findByEmpName(String empName);
	public List<EmployeeModel> findByEmpSalary(float empSalary);
	
	public List<EmployeeModel> findByEmpSalaryLessThan(float empsalary);
	
	/*List<User> findByNameIs(String name);
	List<User> findByNameEquals(String name);
	List<User> findByNameIsNot(String name);
	List<User> findByNameIsNull();
	List<User> findByNameIsNotNull();
	List<User> findByActiveTrue();
	List<User> findByActiveFalse();
	List<User> findByNameStartingWith(String prefix);
	List<User> findByNameEndingWith(String suffix);
	List<User> findByNameContaining(String infix);
	List<User> findByNameLike(String likePattern);
	List<User> findByAgeLessThan(Integer age);
	List<User> findByAgeLessThanEqual(Integer age);
	List<User> findByAgeBetween(Integer startAge, Integer endAge);
	List<User> findByBirthDateAfter(ZonedDateTime birthDate);
	List<User> findByBirthDateBefore(ZonedDateTime birthDate);
	List<User> findByAgeIn(Collection<Integer> ages);
	List<User> findByNameOrderByName(String name);
	List<User> findByNameOrderByNameAsc(String name);*/

}
