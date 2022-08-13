package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;

class Employee
{
	private int empId;
	private String empName;
	private float empSalary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary);
	}
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		
		
		
		//filter method will return entire obbject, but not specific values
		// TODO Auto-generated method stub
		Employee e1 = new Employee(200,"Nagu",123.45f); Employee e2 = new Employee(10,"Satish",98.45f);
		Employee e3 = new Employee(700,"AMadhu",145.45f); Employee e4 = new Employee(20,"Vignan",189.45f);
		Employee e5 = new Employee(900,"Ramesh",100.45f); Employee e6 = new Employee(800,"Ruthvika",191.45f);
		Employee e7 = new Employee(800,"Ruthvika",192.45f);
		
		List<Employee> lst = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		//Sorting based on empname
		List<Employee> sortedList = lst.stream()
				.sorted(Comparator.comparing(Employee::getEmpName))
				.collect(Collectors.toList());
		System.out.println("SORTING BBASED ON EMP NAME");
		sortedList.forEach(System.out::println);
		
		//Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getEmpName().compareTo( o2.getEmpName() );
		 
		//Collections.sort(lst, compareByName);

		
		//Sorting based on empid
				List<Integerc> sortedList123 = lst.stream()
						.Map(Employee::getEmpId).sorted(Integer::compare)
		        .collect(Collectors.toList());
		
		//Sorting based on empid
		List<Employee> sortedList1 = lst.stream()
				.sorted(Comparator.comparingInt(Employee::getEmpId))
        .collect(Collectors.toList());
		System.out.println("SORTING BBASED ON EMP ID");
		sortedList1.forEach(System.out::println);
		
		 List < Employee > employeesSortedList2 = lst.stream()
		            .sorted((o1, o2) -> (o1.getEmpId() - o2.getEmpId())).collect(Collectors.toList());
		        System.out.println("++++++++++++++"+employeesSortedList2);
		
		//Sorting based on EMPSALARY
		List<Employee> sortedList2 = lst.stream()
				.sorted(Comparator.comparingDouble(Employee::getEmpSalary))
        .collect(Collectors.toList());
		System.out.println("SORTING BBASED ON EMP SALARY");
		sortedList2.forEach(System.out::println);
		
		//Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getEmpSalary().compareTo( o2.getEmpSalary() );
		 List < Employee > employeesSortedList1 = lst.stream()
		            .sorted((o1, o2) -> (int)(o1.getEmpSalary() - o2.getEmpSalary())).collect(Collectors.toList());
		        System.out.println("?????????"+employeesSortedList1);
		
		
		//Display all employee names
		List<String> names=lst.stream().map(n->n.getEmpName()).collect(Collectors.toList());
		System.out.println("All Employee Names"+names);
		
		//Display distinct employee names
		List<String> distinctnames=lst.stream().map(n->n.getEmpName()).distinct().collect(Collectors.toList());
		System.out.println("All Employee distinct Names"+distinctnames);
		
		//Display all employee names in Capitals
		List<String> capital=lst.stream().map(n->n.getEmpName().toUpperCase()).collect(Collectors.toList());
		System.out.println("All Employee Names IN CAPITAL"+capital);
		
		//Display all employee objects WHOSE SALARY GREATERTHAN 500
		
		  List<Employee> maxSal=lst.stream().filter(emp->emp.getEmpSalary() >
		  189.45f).collect(Collectors.toList());
		  System.out.println("All Employee Names salary"+maxSal);
		 
		//Display all employee salaries(only salaries) WHOSE SALARY GREATERTHAN 500
		List<Float> onlySalaries = lst.stream()
        .filter(e -> e.getEmpSalary() > 100)
        .map(Employee::getEmpSalary)
        .collect
        (Collectors.toList());
		
		System.out.println("Only Salaries=="+onlySalaries);
		
		//Display all employee names WHOSE name starts with VI 
		List<Employee> startWith=lst.stream().filter(emp->emp.getEmpName().startsWith("V")).collect(Collectors.toList());
		System.out.println("All Employee Names start with"+startWith);
				
		
		//Display all only employee names WHOSE name starts with VI 
		List<String> startWithOnlyNames=lst.stream().filter(emp->emp.getEmpName().startsWith("V")).map(Employee::getEmpName).collect(Collectors.toList());
		System.out.println("All Employee Names salary"+startWithOnlyNames);
		
		
		//Comparator<Employee> compareByName = (Employee o1, Employee o2) -> o1.getEmpName().compareTo( o2.getEmpName() );
		 
		//Collections.sort(lst, compareByName);
		
		//Comparator<Employee> sortById = (e11, e22) -> Integer.compare(e11.getEmpId(), e22.getEmpId());
		//Collections.sort(lst, sortById);
		
		Comparator<Employee> sortBySalary = (e111, e222) -> Double.compare(e111.getEmpSalary(), e222.getEmpSalary());//Float or Double will work
		Collections.sort(lst, sortBySalary);
		
		System.out.println("SORTING BASED ON EMP NAME...");
		for(Employee e:lst)
			System.out.println(e);
		
		Optional<Employee> max=lst.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary)));
		System.out.println("MAX SALARY==="+max);
		
		Float maxSalary = lst.stream()
				 .map(Employee::getEmpSalary)
				 .max(Float::compare).get();
		
		System.out.println("MAX SALARY==="+maxSalary);
		
		//Second highest salary, 3rd highest
		Optional<Employee> emp = lst.stream()
		        .sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).skip(1).findFirst();

		System.out.println("Second highest salary"+emp);
		
		List<Employee> sortedList11 = lst.stream()
				.sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).collect(Collectors.toList());
		
		
		System.out.println("...."+emp+"??????"+sortedList11);

	}

}
