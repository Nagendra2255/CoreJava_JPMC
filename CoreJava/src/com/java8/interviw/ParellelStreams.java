package com.java8.interviw;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParellelStreams {

	public static void main(String[] args) {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println("availableProcessors=="+availableProcessors);
		
		List<Integer> lst = Arrays.asList(23,21,34,32,45,67,54,67,89,88);
		List<Integer> lst1 = IntStream.rangeClosed(5, 10).boxed().collect(Collectors.toList());
		System.out.println(lst1);
		lst1.forEach(s->
		{
			
		System.out.println(LocalTime.now() + " Value "+s+" -thread :"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	});
	

}
}
