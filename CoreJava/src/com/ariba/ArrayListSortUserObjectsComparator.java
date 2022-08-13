package com.ariba;
import java.util.*;

class Employee3
{
	int empId;
    String empName;
	public Employee3(int empId, String empName) {
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
		if (getClass() != obj.getClass())
			return false;
		Employee3 other = (Employee3) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}

class empIdSorting implements Comparator<Employee3> {
  
    // override the compare() method
    public int compare(Employee3 s1, Employee3 s2)
    {
        if (s1.empId == s2.empId)
            return 0;
        else if (s1.empId > s2.empId)
            return 1;
        else
            return -1;
    }
}

class empNameSorting implements Comparator<Employee3> {
	  
    // override the compare() method
    public int compare(Employee3 s1, Employee3 s2)
    {
       return -s1.empName.compareTo(s2.empName);
    }
}

public class ArrayListSortUserObjectsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  List<Employee3> lst = new ArrayList<Employee3>();
		  lst.add(new Employee3(200,"Abc")); lst.add(new Employee3(600,"xcv"));
		  lst.add(new Employee3(600,"xca"));  lst.add(new Employee3(900,"pol"));
		  
		  System.out.println("BEFORE SORTING.."); 
		  for(Employee3 i : lst) 
		  {
		  System.out.println(i);
		  } 
		  System.out.println("AFTER SORTING...");
		  
		  Collections.sort(lst,new empNameSorting()); 
	
		  for(Employee3 i : lst) 
		  {
		  System.out.println(i);
		  } 
		


	}

}
