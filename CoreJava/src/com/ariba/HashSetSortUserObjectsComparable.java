package com.ariba;
import java.util.*;

class Employee4 implements Comparable<Employee4>
{
	public int empId;
	public String empName;
	public Employee4(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		int prime=1;
		return prime*this.empId*this.empName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		/*
		 * if (!(obj instanceof Simple1)); return false;// avoid this. we have to use below
		 */		 
		if (this == obj)
			return true;
	
		 if(obj == null || obj.getClass()!= this.getClass())
	            return false;
		 Employee4 e =(Employee4)obj;
		Employee4 other = (Employee4) obj;
		return this.empId == e.empId && e.empName.equals(this.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	//SORTING BASED ON EMPNAME
	/*
	 * @Override public int compareTo(Employee4 o) { return
	 * (this.empName).compareTo(o.empName);
	 * 
	 * }
	 */
	//SORTING BASED ON EMPID
	@Override
	public int compareTo(Employee4 o)
	{
		if(this.empId==o.empId)
			return 0;
		else if(this.empId>o.empId)
			return 1;
		else
			return -1;
		//return this.empName.compareTo(o.empName);
		
	}
	
	//Sorting based on empid, we have to use 0,-1,1 only. Since we are applying on primitives. We can't use compareTo. This is only for strings.
	
	/*
	 * @Override public int compareTo(Employee o) { //return
	 * (this.empName).compareTo(o.empName); if(this.empId==o.empId) return 0; else
	 * if(this.empId>o.empId) return 1; else return -1; }
	 */
	
}

public class HashSetSortUserObjectsComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Set<Employee4> lst = new HashSet<Employee4>();
		  lst.add(new Employee4(200,"Abc")); lst.add(new Employee4(600,"xcv")); lst.add(new Employee4(1000,"lop"));
		  lst.add(new Employee4(600,"xcv"));  lst.add(new Employee4(900,"pol")); lst.add(new Employee4(100,"pol"));
		  
		  System.out.println("BEFORE SORTING.."); 
		  for(Employee4 i : lst) 
		  {
		  System.out.println(i);
		  } 
		  System.out.println("AFTER SORTING..");
		  
		  //WE can use in 3 ways
		 /* 1) Set<Employee4> t = new TreeSet<Employee4>(lst);
		  2) Set<Employee4> t = new TreeSet<Employee4>(); t.addAll(lst);
		  3) Set<Employee4> t = new TreeSet<Employee4>(lst);t.addAll(lst); */
		  
		Set<Employee4> t = new TreeSet<Employee4>(lst);
		//t.addAll(lst);

		t.forEach(System.out::println);

	}

}
