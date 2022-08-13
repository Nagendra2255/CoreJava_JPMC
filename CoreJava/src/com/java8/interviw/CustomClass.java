package com.java8.interviw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Function;

class Nagendra
{
	Integer id;
	String name;
	Float salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Nagendra [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Nagendra(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class CustomClass {

	public static void main(String[] args) {
		String s1="I";
		String s2=new String("I");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
		Nagendra e1 = new Nagendra(200,"Nagu",123.45f); Nagendra e2 = new Nagendra(10,"Satish",98.45f);
		Nagendra e3 = new Nagendra(700,"AMadhu",145.45f); Nagendra e4 = new Nagendra(20,"Vignan",189.45f);
		Nagendra e5 = new Nagendra(900,"Ramesh",100.45f); Nagendra e6 = new Nagendra(800,"Ruthvika",191.45f);
		//Nagendra e7 = new Nagendra(800,"Ruthvika",192.45f);
		
		List<Nagendra> lst = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		//Display only names
		
		List<String> names = lst.stream().map(x->x.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		//Display only names
		
				List<String> names0 = lst.stream().map(Nagendra::getName).distinct().collect(Collectors.toList());
				System.out.println("......"+names0);
		//Display only distinct names using distinct method
		
		List<String> names1 = lst.stream().map(x->x.getName()).distinct().collect(Collectors.toList());
		System.out.println(names1);
		
		//Display only distinct names using SET
		
		Set<String> names2 = lst.stream().map(x->x.getName()).collect(Collectors.toSet());
		System.out.println(names2);
		
		//Display max salary
		
		Float max = lst.stream().map(Nagendra::getSalary).max(Float::compare).get();
		System.out.println(max);
		
		//Integer max = lst.stream().max(Integer::compare).get();//for int
		
		//Display min salary
		
		Float min = lst.stream().map(x->x.getSalary()).min(Float::compare).get();
		System.out.println(min);
		
		//Display employees whose name "Ruthvika" 
		
		List<Nagendra> name11 = lst.stream().filter(x->x.getName().contains("Ruthvika")).collect(Collectors.toList());
		System.out.println(name11);
		
		
		
	//Display employees whose name starts with "R"
		
		List<Nagendra> name22 = lst.stream().filter(x->x.getName().startsWith("R")).collect(Collectors.toList());
		System.out.println(name22);
		
		//Sorting based on ID
		
		List<Nagendra> sortid = lst.stream().sorted((x,y)->x.getId().compareTo(y.getId())).collect(Collectors.toList());
		System.out.println("Sorting based on ID");
		System.out.println(sortid);

		//Sorting based on ID using method reference
		List<Nagendra> sortid1 = lst.stream().sorted(Comparator.comparingInt(Nagendra::getId)).collect(Collectors.toList());
		System.out.println("Sorting based on ID using method reference");
		System.out.println(sortid1);
		
		
		//Sorting based on Name
		
		List<Nagendra> sortname = lst.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
		System.out.println("Sorting based on name");
		System.out.println(sortname);

		//Sorting based on NAME using method reference
		List<Nagendra> sortname1 = lst.stream().sorted(Comparator.comparing(Nagendra::getName)).collect(Collectors.toList());
		System.out.println("Sorting based on name using method reference");
		System.out.println(sortname1);
		
		//Sorting based on SALARY
		
		List<Nagendra> sortsal = lst.stream().sorted((x,y)->x.getSalary().compareTo(y.getSalary())).collect(Collectors.toList());
		System.out.println("Sorting based on SALARY");
		System.out.println(sortsal);

		//Sorting based on SALARY using method reference
		List<Nagendra> sortsal1 = lst.stream().sorted(Comparator.comparingDouble(Nagendra::getSalary)).collect(Collectors.toList());
		System.out.println("Sorting based on  SALARY using method reference");
		System.out.println(sortsal1);
		
	
		
		//SECOND HIGHEST SALARY
		
		Optional<Nagendra> emp = lst.stream()
		        .sorted(Comparator.comparingDouble(Nagendra::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Second highest salary"+emp);
		
		//Display all employee salaries(only salaries) WHOSE SALARY GREATERTHAN 500
				List<Float> onlySalaries = lst.stream()
		        .filter(e -> e.getSalary() > 100)
		        .map(Nagendra::getSalary)
		        .collect
		        (Collectors.toList());
				
				Optional<Nagendra> empll = lst.stream()
				        .sorted(Comparator.comparingDouble(Nagendra::getSalary).reversed()).skip(1).findFirst();

				System.out.println(emp.get());
				//////////////////////////////////////////////////////////////////////////
				
				 List<String> items =
			                Arrays.asList("apple", "apple", "banana",
			                        "apple", "orange", "banana", "papaya");
				 
				 Map<String, Long> result =
			                items.stream().collect(
			                        Collectors.groupingBy(
			                                Function.identity(), Collectors.counting()
			                        )
			                );

			        System.out.println(".........."+result);//..........{papaya=1, orange=1, banana=2, apple=3}
				
			        Map<BigDecimal, List<Item>> groupByPriceMap = 
			    			items.stream().collect(Collectors.groupingBy(Item::getPrice));
			        
			        Map<String, Long> finalMap = new LinkedHashMap<>();

			        //Sort a map and add to finalMap
			        result.entrySet().stream()
			                .sorted(Map.Entry.<String, Long>comparingByValue()
			                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

			        System.out.println(finalMap);//{apple=3, banana=2, papaya=1, orange=1}
			        
			        //Karthik..........
			      // List<Nagendra> grpByDept=lst.stream().collect(Collectors.groupingBy(e->e.getId(),Collectors.toList()));
	                                
			        
			        //LIST TO MAP
			        
			        Map<Integer, String> map=lst.stream().collect(
			                Collectors.toMap(Nagendra::getId, Nagendra::getName));
			        for(Map.Entry<Integer, String> map1 : map.entrySet())
			        	System.out.println(map1.getKey()+"   "+map1.getValue());

	}

}
