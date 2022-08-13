package com.java8.interviw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class IntegerOperations {

	public static void main(String[] args) {
		
		List<Integer> lstt = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		List<Integer> sss=lstt.stream().sorted().collect(Collectors.toList());
		System.out.println(sss);
		
		int a[]= {45,12,7,32,90};
		Arrays.sort(a);
		for(Integer i:a)
		System.out.println(i);
		
		/*
		 List<Integer> lst = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		 
		
		
		
		//Ascending order sort using forEach
		lst.stream().sorted().forEach(System.out::println);
		
		//Descending order sort 
		List<Integer> sort = lst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);

		//Max element display
		Integer max = lst.stream().max(Integer::compare).get();
		System.out.println(max);
		
		//Max element display using compareTo
		int maxValue=lst.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(maxValue);
		
		//Min element display
		Integer min = lst.stream().min(Integer::compare).get();
		System.out.println(min);
		
		//sum of all elements
		Integer sum = lst.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		Integer sum1 = lst.stream()
			.collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum1);
		
		//Average of all elements
		OptionalDouble average = lst.stream().mapToInt(Integer::intValue).average();
		System.out.println(average);
		
		//ddistinct of all elements
		List<Integer> distinct = lst.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		//Distinct of all elements
		Set<Integer> distinct1 = lst.stream().collect(Collectors.toSet());
		System.out.println(distinct1);
		*/
		
		
		
		/*
		List<Double> lst = Arrays.asList(11.23, 2.5, 5.2, 3.89, 2.5, 55.0, 32.45, 34.0);
		//Ascending order sort using forEach
				lst.stream().sorted().forEach(System.out::println);
				
				//Descending order sort 
				List<Double> sort = lst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
				System.out.println(sort);

				//Max element display
				Double max = lst.stream().max(Double::compare).get();
				System.out.println(max);
				
				//Max element display using compareTo
				Double maxValue=lst.stream().max((x,y)->x.compareTo(y)).get();
				System.out.println(maxValue);
				
				//Min element display
				Double min = lst.stream().min(Double::compare).get();
				System.out.println(min);
				
				//sum of all elements
				Double sum = lst.stream().mapToDouble(Double::intValue).sum();
				System.out.println(sum);
				
				Double sum1 = lst.stream()
					.collect(Collectors.summingDouble(Double::intValue));
				System.out.println(sum1);
				
				//Average of all elements
				OptionalDouble average = lst.stream().mapToInt(Double::doubleValue).average();
				System.out.println(average);
				
				//ddistinct of all elements
				List<Double> distinct = lst.stream().distinct().collect(Collectors.toList());
				System.out.println(distinct);
				
				//Distinct of all elements
				Set<Double> distinct1 = lst.stream().collect(Collectors.toSet());
				System.out.println(distinct1);
				
			*/	
				List<Float> lst=Arrays.asList(40.5f,20.6f,10.1f,44.9f,90.0f,67.3f,56.2f,20.8f);
				
				//Ascending order sort using forEach
				lst.stream().sorted().forEach(System.out::println);
				
				//Descending order sort 
				List<Float> sort = lst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
				System.out.println(sort);

				//Max element display
				Float max = lst.stream().max(Float::compare).get();
				System.out.println(max);
				
				//Max element display using compareTo
				Float maxValue=lst.stream().max((x,y)->x.compareTo(y)).get();
				System.out.println(maxValue);
				
				//Min element display
				Float min = lst.stream().min(Float::compare).get();
				System.out.println(min);
				
				//sum of all elements
				Double sum = lst.stream().mapToDouble(Float::floatValue).sum();
				System.out.println(sum);
				
				Double sum11 = lst.stream().mapToDouble(Float::floatValue).sum();
				System.out.println(sum);
				
				Double sum1 = lst.stream()
					.collect(Collectors.summingDouble(Float::floatValue));
				System.out.println(sum1);
				
				//Average of all elements
				OptionalDouble average = lst.stream().mapToInt(Float::intValue).average();
				System.out.println(average);
				
				//ddistinct of all elements
				List<Float> distinct = lst.stream().distinct().collect(Collectors.toList());
				System.out.println(distinct);
				
				//Distinct of all elements
				Set<Float> distinct1 = lst.stream().collect(Collectors.toSet());
				System.out.println(distinct1);
		

	}

}
