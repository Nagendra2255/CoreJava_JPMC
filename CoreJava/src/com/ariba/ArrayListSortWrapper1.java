package com.ariba;
import java.util.*;

public class ArrayListSortWrapper1 {

	public static void main(String[] args) {
		//static int count =0;
		// TODO Auto-generated method stub
		
		 
		int a[] = {12,45,78,999,6};
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}
		
		
		
		  List<Integer> lst = new ArrayList<Integer>(); 
		  lst.add(300); 
		  lst.add(700);
		  lst.add(100); 
		  lst.add(600);
		  lst.add(400);
		  lst.add(700);
		  lst.add(700);
		  //System.out.println(lst);
		  //System.out.println("Sixe of arraylist is ..."+lst.size());
		 //Collections.sort(lst);
		 // Collections.reverse(lst);//Just it will reverse the list but not do sorting
		  System.out.println("After Sorting..");
		  Collections.sort(lst);
		  System.out.println(lst);
		  // //Sort the list and return comparator for reverse order  
          Collections.sort(lst, Collections.reverseOrder());   
          System.out.println(lst);
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  Iterator i = lst.iterator();
			while(i.hasNext())
				{
				System.out.println(i.next());
				
				}
			
			  ListIterator i1 = lst.listIterator();
				while(i1.hasNext())
					{
					//System.out.println(i1.next());
					
					}
		 /* System.out.println("BEFORE SORTING.."); 
		  for(Integer i : lst) {
		  System.out.println(i); 
		  } System.out.println("AFTER SORTING...");
		  Collections.sort(lst); 
		  for(Integer i : lst) { System.out.println(i); }
		 
		
		/*List<Integer> lst11 = new ArrayList<Integer>(); 
		lst11.add(300); lst11.add(700);
		Iterator i = lst11.iterator();
		while(i.hasNext())
			{
			lst11.add(100);
			
			}
		
		System.out.println(lst11.size());

		
		 * List<String> lst = new ArrayList<String>(); lst.add("qwe");
		 * lst.add("jhlkjl"); lst.add("jhj"); lst.add("adsds"); lst.add("rtt");
		 * lst.add("vbnv"); System.out.println("BEFORE SORTING.."); for(String i : lst)
		 * { System.out.println(i); } System.out.println("AFTER SORTING...");
		 * Collections.sort(lst); for(String i : lst) { System.out.println(i); }
		 */

		
		
	}

}
