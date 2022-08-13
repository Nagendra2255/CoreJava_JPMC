package com.ariba;
import java.util.*;

public class HashSetSortWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Set<Integer> lst = new HashSet<Integer>();
		  lst.add(300); 
		  lst.add(700);
		  lst.add(100); 
		  lst.add(600); 
		  lst.add(400); 
		  lst.add(700);
		  lst.add(700);
		  
		  System.out.println(lst);
		  
		  TreeSet tt = new TreeSet(lst);
		  
		  System.out.println(tt);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  System.out.println("BEFORE SORTING.....");
		 
		  
		  for(Integer i : lst) 
		  {
		  System.out.println(i); 
		  } 
		  System.out.println("................AFTER SORTING.......");
		  
		  //USING TREESEET SOORTING
		  TreeSet ts = new TreeSet(lst);
		  for(Object ii: ts)
		  {
			  System.out.println(ii);
		  }
		  //USING COLLECTIONS.SORT
		  System.out.println("using collections.sort...");
		  ArrayList<Integer> al = new ArrayList<Integer>(lst);
		  //al=(ArrayList<Integer>) lst;
		  
		  Collections.sort(al); 
		  for(Integer i : al)
		  { 
			  System.out.println(i); 
			  }
		 
		
		
		 //LinkedHashSet--Which preserves the insertion order.
		

		  Set<Integer> lst1 = new LinkedHashSet<Integer>();
		  lst1.add(300); lst1.add(700);
		  lst1.add(100); lst1.add(600); 
		  lst1.add(400); lst1.add(700);
		  System.out.println("BEFORE SORTING..");
		  
		  //Using lambda expression
		  lst1.forEach((s->System.out.println(s)));
		//Using lambda expression another approach
		  lst1.forEach(System.out::println);
			/*
			 * for(Integer i : lst) { System.out.println(i); }
			 */
		  System.out.println("AFTER SORTING...");
		  ArrayList<Integer> al1 = new ArrayList<Integer>(lst1);
		  //al=(ArrayList<Integer>) lst;
		  
		  Collections.sort(al1); 
			/*
			 * for(Integer i : lst) { System.out.println(i); }
			 */
		  Iterator<Integer> i = al1.iterator();
		  while(i.hasNext())
		  {
			  System.out.println(i.next());
		  }
		


	}

}
