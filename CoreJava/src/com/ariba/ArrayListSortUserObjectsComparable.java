package com.ariba;
import java.util.*;

class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
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
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	//SORTING BASED ON EMPNAME
	@Override
	public int compareTo(Employee o)
	{
		return (this.empName).compareTo(o.empName);
		
	}
	
	//Sorting based on empid, we have to use 0,-1,1 only. Since we are applying on primitives. We can't use compareTo. This is only for strings.
	
	/*
	 * @Override public int compareTo(Employee o) { //return
	 * (this.empName).compareTo(o.empName); if(this.empId==o.empId) return 0; else
	 * if(this.empId>o.empId) return 1; else return -1; }
	 */
	
}

public class ArrayListSortUserObjectsComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  List<Employee> lst = new ArrayList<Employee>();
		  lst.add(new Employee(200,"Abc")); lst.add(new Employee(600,"xcv"));
		  lst.add(new Employee(600,"xca"));  lst.add(new Employee(900,"pol"));
		  
		  System.out.println("BEFORE SORTING.."); 
		  for(Employee i : lst) 
		  {
		  System.out.println(i);
		  } 
		  System.out.println("AFTER SORTING...");
		  
		  Collections.sort(lst); 
	
		  for(Employee i : lst) 
		  {
		  System.out.println(i);
		  } 
		


	}

}
