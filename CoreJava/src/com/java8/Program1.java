package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface One
{
	public void m1();
	default void df()
	{
		System.out.println("default implementation.");
	}
	
}
interface One1
{
	
	public void m2(int a);
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o=()->System.out.println("Welcome");
		o.m1();
		One1 o1=(s)->
		{
			s=s*2;
			System.out.println("Welcome"+s);
		};
		o1.m2(10);
		Runnable r=()->
		{
			
				System.out.println("RUNNABLE");
			
		};
		Thread t = new Thread(r);
		t.start();
		
		//Predicate will return boolean value. It has test() method
		Predicate<Integer> test=(a)->a>4;
		boolean b=test.test(1);
		System.out.println(b);
		//Function can return any value and it has apply() method.
		//First argument is Input type, Second argument is return type
		Function<String,Integer> fun=(s)->s.length();
		Integer le=fun.apply("Durga");
		System.out.println("..."+le);
		
		List<Integer> lst=Arrays.asList(40,20,10,44,90,67,56,20);
		List<Double> double1=Arrays.asList(40.5,20.6,10.1,44.9,90.0,67.3,56.2,20.8);
		List<Float> float1=Arrays.asList(40.5f,20.6f,10.1f,44.9f,90.0f,67.3f,56.2f,20.8f);
		List<Double> sort2=double1.stream().sorted().collect(Collectors.toList());
		Double maxd=double1.stream().max(Double::compare).get();
		
		Double dminValue=double1.stream().min((x,y)->x.compareTo(y)).get();
		Double dmaxValue=double1.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Double max and min...."+dminValue+"dmaxValue="+dmaxValue);
		
		System.out.println("Double max.."+maxd);
		for(Double v:sort2)
			System.out.println(v);
		
		List<String> strLst=Arrays.asList("Hello","Welcome","Bye","Takecare","All");
		List<String> sort1=strLst.stream().sorted().collect(Collectors.toList());
		System.out.println("????????????????");
		for(String v:sort1)
			System.out.println(v);
		
		Integer max1=lst.stream().max(Integer::compare).get();
		//Find Min, Max, count,avg, remove duplicates
		Integer max=lst.stream().max(Integer::compare).get();
		Integer min=lst.stream().min(Integer::compare).get();
		int minValue=lst.stream().min((x,y)->x.compareTo(y)).get();
		int maxValue=lst.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max.."+max+"Min=="+min+"minvalue==="+minValue+"maxvalue=="+maxValue);
		List<Integer> sort=lst.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted"+sort);
		
		//Remove duplicates
		Set<Integer> st=lst.stream().collect(Collectors.toSet());
		List<Integer> st1=lst.stream().distinct().collect(Collectors.toList());
		System.out.println("......................"+st1);
		System.out.println("Remove duplicates.."+st);
		int count=(int) lst.stream().count();
		System.out.println("count..."+count);
		
		long total = lst.stream().distinct().count();
		System.out.println("distinct values count...."+total);
		List<Integer> distinct=lst.stream().distinct().collect(Collectors.toList());
		System.out.println("Distince values.."+distinct);
		
		List<String> str=Arrays.asList("hello","hai","SUN","jun","mon");
		//Upper case
		List<String> upper=str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("UPPERCASE.."+upper);
		List<String> lower=str.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println("LOWERCASE.."+lower);
		
		List<String> startWith=str.stream().filter(s->s.startsWith("h")).collect(Collectors.toList());
		System.out.println("START WITH.."+startWith);
		//With limit method
		List<String> startWithLimit=str.stream()
				.filter(s->s.startsWith("h"))
				.limit(2)
				.collect(Collectors.toList());
		System.out.println("START WITH Limit.."+startWithLimit);
		
		
		
		// Use JAVA 8 feature 
		//String str = "I would loved to be the part of cricket team";

		ArrayList <String> list = new ArrayList<String>(); 
		list.add("part");
		list.add("wipro");
		list.add("betwipro");
		list.add("bewiprolimitedar");
		list.add("beat");
		list.add("become"); 
		list.add("begin");

		List<String> anyMatch = list.stream().filter(s -> s.contains("wipro")).collect(Collectors.toList());
		System.out.println(anyMatch);
		
		string b = new string("hh");	
		String c =(String)b;

	}

}
