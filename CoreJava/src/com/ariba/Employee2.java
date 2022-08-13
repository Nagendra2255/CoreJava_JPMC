package com.ariba;

import java.util.Objects;
import java.util.*;

 class Employee1 implements Comparable<Employee1>{
	private int empId;
	private String empname;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return empId == other.empId && Objects.equals(empname, other.empname);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + "]";
	}
	public Employee1(int empId, String empname) {
		super();
		this.empId = empId;
		this.empname = empname;
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
      
		
		if(this.empId==o.empId)
			return 0;
		else if(this.empId>o.empId)
			return 1;
		else
			return -1;
		
	}
	

}
 class Employee2
 {
	 public static void main(String args[])
	 {
		 List<Employee1> lst = new ArrayList<Employee1>();
		
		 List<Employee> duplicateLst = new ArrayList<Employee>();
		 
		 Employee1 e1 = new Employee1(100,"AAA"); Employee1 e2 = new Employee1(500,"ccc"); Employee1 e3 = new Employee1(400,"xxx");
		 lst.add(e1); lst.add(e2); lst.add(e3);
		 System.out.println("Before sorting");
		 for(Employee1 e : lst)
			 System.out.println(e);
		 Collections.sort(lst);
		 System.out.println("After sortinng");
		 for(Employee1 e : lst)
			 System.out.println(e);
		 
		 
		 
	 }
 }
 

