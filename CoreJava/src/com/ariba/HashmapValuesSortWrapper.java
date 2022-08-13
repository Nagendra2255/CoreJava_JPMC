56package com.ariba;
import java.util.*;
import java.util.Map.Entry;

public class HashmapValuesSortWrapper {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("Satish", 100); map.put("Ramesh", 100); map.put("Abbhi", 500);
		map.put("Nagendra", 700); map.put("Vignan", 900);
		
		
		//To get only hashmap values
		Collection<Integer> i = map.values();
		System.out.println(i);//[500, 100, 700, 100, 900]
		for(Integer s : i)
		{
			System.out.println(s);	
		}
       //To get only HashMap keys
		Set<String> s = map.keySet();
		for(String s1 : s)
		{
			System.out.println(s1);	
		}
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		Set<Map.Entry<String,Integer>> mp = map.entrySet();
		Set<Entry<String,Integer>> mp2 = map.entrySet();
		Set<String> mp1 = map.keySet();
		System.out.println(mp);
		
		System.out.println(mp2);
		//System.out.println(mp1);
		
		while(iterator.hasNext())
		
			System.out.println(iterator.next());	
		
		
		
		//To get  HashMap both keys and values as Entryset
		
//		System.out.println("BEFORE SORTING...");
//		for(Map.Entry<String,Integer> mp : map.entrySet())
//		{
//			System.out.println(mp.getKey()+"    "+mp.getValue());
//		}
//		
//		System.out.println("AFTER SORTING...BBased on keys");
//		TreeMap<String,Integer> ts = new TreeMap<String,Integer>(map);
//		for(Map.Entry<String,Integer> mp : ts.entrySet())
//		{
//			System.out.println(mp.getKey()+"    "+mp.getValue());
//		}
		/*Before we iterate through a map using the three methods, let's understand what these methods do:

		entrySet() – returns a collection-view of the map, whose elements are from the Map.Entry class. The entry.getKey() method returns the key, and entry.getValue() returns the corresponding value
		keySet() – returns all keys contained in this map as a Set
		values() – returns all values contained in this map as a Set
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
		
		for (String key : map.keySet()) {
	        System.out.println(key + ":" + map.get(key));
	    }
		
		for (Integer value : map.values()) {
	        System.out.println(value);
	    }
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
	    while (iterator.hasNext()) {
	        Map.Entry<String, Integer> entry = iterator.next();
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	    
	    
	    Iterator<String> iterator = map.keySet().iterator();
	    while (iterator.hasNext()) {
	        String key = iterator.next();
	        System.out.println(key + ":" + map.get(key));
	    }
	    
	    
	    Iterator<Integer> iterator = map.values().iterator();
	    while (iterator.hasNext()) {
	        Integer value = iterator.next();
	        System.out.println("value :" + value); 9492884622
	    }
*/
		
	}

}
