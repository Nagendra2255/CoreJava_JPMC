package com.ariba;
import java.util.*;

class Employ
{
	 int empId;
	 String empName;
	public Employ(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		final int  prime=1;
		return empId*this.empName.hashCode()*prime;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employ other = (Employ) obj;
		return this.empId==other.empId && this.empName.equals(other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	
}
}
class empIdSorting4 implements Comparator<Employ>
{
	@Override
	public int compare(Employ o1, Employ o2)
	{
		System.out.println(".......????????????");
		if(o1.empId==o2.empId)
			return 0;
		if(o1.empId>o2.empId)
			return -1;
		else
			return -1;
		
	}
}
	
class empNameSorting4 implements Comparator<Employ>
	{
		@Override
		public int compare(Employ o1, Employ o2)
		{
			return o1.empName.compareTo(o2.empName);
			
		}
}

public class HashMapSortUserObjectsComparator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Map<Integer,Employ> lst = new HashMap<Integer,Employ>();
		  lst.put(100,new Employ(200,"Abc")); 
		  lst.put(500,new Employ(600,"xcv"));
		  lst.put(700,new Employ(600,"xca")); 
		  lst.put(200,new Employ(900,"pol"));
		  
		  System.out.println("ONLY HASHMAP VALUES..."); 
		  //Collection<Integer> values=lst.values();
		  Collection<Employ> values=lst.values();
		  System.out.println(values);
		  
		  System.out.println("ONLY HASHMAP KEYS...");
		  //Set<Employe> keys = lst.keySet();
		  Set<Integer> keys = lst.keySet();
		 // keys.forEach(System.out::print);
		  keys.forEach(s->System.out.println(s));
		  
		  System.out.println("ONLY HASHMAP ENTRYSET...");
		  
		  Set<Map.Entry<Integer,Employ>> entryset=lst.entrySet();
		  
		  for(Map.Entry<Integer,Employ> m:entryset)
			  System.out.println(m.getKey()+"..."+m.getValue());
		  lst.forEach((k,v)->System.out.println(k+"\t"+v));
		  
		  System.out.println("HASHMAP SORTING BASED ON KEYS using comparator");
		  //TreeMap<Employee,Integer> tm = new TreeMap<Employee,Integer>();
		 // Map<Integer,Employ> t = new TreeMap<Integer,Employ>(new empIdSorting4());
		//  TreeMap<Integer, Employ> treeMapEmployees = new TreeMap<Integer, Employ>(new empIdSorting4());
		 // treeMapEmployees.forEach((k,v)->System.out.println(k+"..."+v));
		  
		 // Set<Map.Entry<Integer,Employe V>>
		  
		  System.out.println("HASHMAP SORTING BASED ON keys using comparator");
		 TreeMap<Integer,Employ> tm = new TreeMap<Integer,Employ>(lst);
		 //Set<Employee5> t = new TreeSet<Employee5>(new empIdSorting1());
		  
		tm.forEach((k,v)->System.out.println(k+".."+v));
		


	}

}
