package com.ariba;
import java.util.*;
import java.util.Map.Entry;

public class HashmapWrapper {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("Satish", 100);
		map.put("Ramesh", 100); 
		map.put("Abbhi", 500);
		map.put("Nagendra", 700); 
		map.put("Vignan", 900);
		
		Collection<Integer> values = map.values();
		
		for(Integer s : values)
		{
			System.out.println(s);
		}
		
		Set<String> keys = map.keySet();
		Set<Map.Entry<String,Integer>> entry=map.entrySet();
		
		System.out.println("...............");
		for(Map.Entry<String,Integer> m:entry)
			System.out.println(m.getKey()+".."+m.getValue());
		
		Iterator entrySet = map.entrySet().iterator();
		((Map<String, Integer>) entrySet).forEach((k,v)->System.out.println(k+"..."+v));
		
		
		System.out.println("Using Java8...");
		
		map.forEach((k,v)->System.out.println(k+"..."+v));
		
		
		  System.out.println("ONLY VALUES.."+values);
		  System.out.println("ONLY KEYS.."+keys);
		  System.out.println("Both entry set values.."+entrySet);//We can not print
		  //iterator object directly so we have to use for or while
		  while(entrySet.hasNext())
		   {
		    System.out.println(entrySet.next()); }
		  for(Map.Entry<String,Integer> s: map.entrySet())
		 // System.out.println(s.getKey()+"...."+s.getValue());
		  
		  //Using java8 forEach 
		  map.forEach((k,v)->System.out.println(k+"..."+v));
		 
		
		//SORTING BASED ON KEYS
		
		 // System.out.println("BEFORE SORTING based on keys.;");
		 // for(Map.Entry<String,Integer> m:map.entrySet())
		 // System.out.println(m.getKey()+"..."+m.getValue()); //TO SORT HASHMAP, WE HAVE
		  //TO USE TREEMAP, BYdefault treemap will use Comparable interface for natural sorting order based on keys by default
		  Map<String,Integer> t = new TreeMap<String,Integer>(map);
		  
		  //System.out.println("AFTER SORTING based on keys.;");
		  for(Map.Entry<String,Integer> m:t.entrySet())
		  //System.out.println(m.getKey()+"..."+m.getValue());
		 
		
	//SORTING BASED ON VALUES
		
		System.out.println("BEFORE SORTING based on Values.;");
		for(Map.Entry<String,Integer> m:map.entrySet())
			System.out.println(m.getKey()+"..."+m.getValue());
		List<Map.Entry<String,Integer>> lst = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		/*
		 * Collections.sort(lst, new Comparator<Map.Entry<String,Integer>>() {
		 * 
		 * @Override public int compare(Map.Entry<String, Integer> o1, Map.Entry<String,
		 * Integer> o2) { return o1.getValue().compareTo(o2.getValue()); }
		 * 
		 * });
		 * 
		 * System.out.println("AFTER SORTING based on Values.;");
		 * lst.forEach(s->System.out.println(s.getKey()+"..."+s.getValue()));
		 */
		
		//We can sort using lambda expressions instead of annonymus class as abovee
		System.out.println("AFTER SORTING based on Values.;");
		Collections.sort(lst, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
		lst.forEach(s->System.out.println(s.getKey()+"..."+s.getValue()));
		
	}

}
