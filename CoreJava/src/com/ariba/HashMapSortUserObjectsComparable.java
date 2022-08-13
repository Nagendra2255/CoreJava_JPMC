package com.ariba;
import java.util.*;

class Employe implements Comparable<Employe>
{
	 int empId;
	 String empName;
	public Employe(int empId, String empName) {
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
		if (this.getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return this.empId==other.empId && this.empName.equals(other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	/*
	 * //SORTING BASED ON EMPNAME
	 * 
	 * @Override public int compareTo(Employe o) { return
	 * (this.empName).compareTo(o.empName);
	 * 
	 * }
	 */
	//SORTING BASED ON KEYS
		@Override
		public int compareTo(Employe o2)
		{
			{
				if(this.empId==o2.empId)
					return 0;
				if(this.empId>o2.empId)
					return -1;
				else
					return -1;
				
			}
			
		}
	
	//Sorting based on empid, we have to use 0,-1,1 only. Since we are applying on primitives. We can't use compareTo. This is only for strings.
	
	/*
	 * @Override public int compareTo(Employee o) { //return
	 * (this.empName).compareTo(o.empName); if(this.empId==o.empId) return 0; else
	 * if(this.empId>o.empId) return 1; else return -1; }
	 */
	
}

public class HashMapSortUserObjectsComparable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Map<Integer,Employe> lst = new HashMap<Integer,Employe>();
		  lst.put(100,new Employe(200,"Abc")); 
		  lst.put(500,new Employe(600,"xcv"));
		  lst.put(700,new Employe(600,"xca")); 
		  lst.put(200,new Employe(900,"pol"));
		  
		 // System.out.println("ONLY HASHMAP VALUES..."); 
		  //Collection<Integer> values=lst.values();
		  Collection<Employe> values=lst.values();
		  System.out.println(values);
		  
		 // System.out.println("ONLY HASHMAP KEYS...");
		  //Set<Employe> keys = lst.keySet();
		  Set<Integer> keys = lst.keySet();
		 // keys.forEach(System.out::print);
		 // keys.forEach(s->System.out.println(s));
		  
		 // System.out.println("ONLY HASHMAP ENTRYSET...");
		  
		  Set<Map.Entry<Integer,Employe>> entryset=lst.entrySet();
		  
		  for(Map.Entry<Integer,Employe> m:entryset)
			 // System.out.println(m.getKey()+"..."+m.getValue());
		//  lst.forEach((k,v)->System.out.println(k+"\t"+v));
		  
		  System.out.println("HASHMAP SORTING BASED ON KEYS using comparable");
		  //TreeMap<Employee,Integer> tm = new TreeMap<Employee,Integer>();
		  Map<Integer,Employe> t = new TreeMap<Integer,Employe>(lst);
		  t.forEach((k,v)->System.out.println(k+"..."+v));
		  
		 // Set<Map.Entry<Integer,Employe V>>
		  
		  System.out.println("HASHMAP SORTING BASED ON VALUES");
		  List<Map.Entry<Integer,Employe>> ll = new ArrayList<Map.Entry<Integer,Employe>>(lst.entrySet());
		  //OR JAVA8
		  //Collections.sort(ll,(o1,o2)->o1.getVAlue.empname.compareTo(o2.getValue.empname));
		  Collections.sort(ll, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
		  System.out.println("USING JAVA8...");
		  ll.forEach(s->System.out.println(s.getKey()+".."+s.getValue()));
		  System.out.println("USING COMPARATOR..");
		  Collections.sort(ll,new Comparator<Map.Entry<Integer,Employe>>()
		  
		  {
			  @Override
			  public int compare(Map.Entry<Integer,Employe> o1, Map.Entry<Integer,Employe> o2)
			  {
				  //return o1.getValue().empName.compareTo(o2.getValue().empName);
				 // return o1.getValue().empId.compareTo(o2.getValue().empId);//It will not work on primitives
				  if(o1.getValue().empId==o2.getValue().empId)
						return 0;
					if(o1.getValue().empId>o2.getValue().empId)
						return 1;
					else
						return -1;
			  }
			  
		  });
		  
		ll.forEach(s->System.out.println(s.getKey()+".."+s.getValue()));
		


	}

}
