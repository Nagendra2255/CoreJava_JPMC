package com.ariba;
import java.util.*;

class Employee5
{
	public int empId;
	public String empName;
	public Employee5(int empId, String empName) {
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
		 Employee5 e =(Employee5)obj;
		return this.empId == e.empId && e.empName.equals(this.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
class empIdSorting2 implements Comparator<Employee5>
{
		//SORTING BASED ON EMPID
		@Override
		public int compare(Employee5 o1,Employee5 o2)
		{
			if(o1.empId==o2.empId)
				return 0;
			if(o1.empId>o2.empId)
				return 1;
			else
				return -1;
			
		}
}

class empNameSorting2 implements Comparator<Employee5>
{
		//SORTING BASED ON EMPID
		@Override
		public int compare(Employee5 o1,Employee5 o2)
		{
			return o1.empName.compareTo(o2.empName);
			
		}
}

public class HashSetSortUserObjectsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Set<Employee5> lst = new HashSet<Employee5>();
		  lst.add(new Employee5(200,"Abc")); lst.add(new Employee5(600,"xcv"));
		  lst.add(new Employee5(600,"xcv"));  lst.add(new Employee5(900,"pol"));
		  
		  System.out.println("BEFORE SORTING.."); 
		  for(Employee5 i : lst) 
		  {
		  System.out.println(i);
		  } 
		  System.out.println("AFTER SORTING..");
		  
		  //TreeM<Employee5> t = new TreeSet<Employee5>(new empIdSorting1());
		  TreeSet<Employee5> t = new TreeSet<Employee5>(new empIdSorting2());
		  t.addAll(lst);
		  System.out.println("...");
		 for(Employee5 e : t)
			 System.out.println(e);

	}

}
