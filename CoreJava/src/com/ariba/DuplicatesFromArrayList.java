package com.ariba;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> lst = new ArrayList<Integer>();
		  List<Integer> newList = new ArrayList<Integer>();
		  lst.add(300); lst.add(700);
		  lst.add(100); lst.add(600); 
		  lst.add(400); lst.add(700);
		  lst.add(300);
		  System.out.println("...."+lst);
		  
		  //Using Hastset removing duplicates
		  Set<Integer> ss = new HashSet<Integer>(lst);
		  System.out.println("????"+ss);
		  
		  //Note: To check duplicates in HashMap, we have containsKey(), In List we have contains()

		  //To Remove duplicates from arraylist
			/*
			 * for(Integer i : lst) { if (!newList.contains(i))
			 * 
			 * newList.add(i); }
			 */
		  //To print only duplicate elements from arraylist
		  Set<Integer> s = new HashSet<Integer>();
		  for(Integer i1:lst)
		  {
			  if(s.add(i1)==false)
			  System.out.println(i1);
		  }
		  for(Integer o: s)
			  System.out.println("....."+o);
	}

}
