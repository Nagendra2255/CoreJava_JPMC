package com.interviewprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Java8PrimitivePrograms {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(200,10,33,450,999);
		
		//Sorting using streams
		List<Integer> sort=lst.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		Integer min=lst.stream().min(Integer::compare).get();
		System.out.println(min);
		Integer max=lst.stream().max(Integer::compare).get();
		System.out.println(max);
		
		OptionalDouble avg=lst.stream().mapToInt(Integer::intValue).average();
		System.out.println(avg);
		
		int sum=lst.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	} 

}
