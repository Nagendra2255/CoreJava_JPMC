package com.java8;import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		//3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
        Map<String, Long> map=items.stream().collect
        		(Collectors.groupingBy
        				(Function.identity(),Collectors.counting()));
        System.out.println(map);//{papaya=1, orange=1, banana=2, apple=3}
        
        
        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
        String s="Welcome";
        for(int i=s.length()-1;i>=0;i--)
        	System.out.println(s.indent(i));
        
        
		/*
		 * Map<String, Integer> sum = items.stream().collect(
		 * Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		 */
        		
	}

}
