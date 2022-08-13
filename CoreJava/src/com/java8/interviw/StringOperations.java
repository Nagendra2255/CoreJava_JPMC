package com.java8.interviw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StringOperations {

	public static void main(String[] args) {

		//List<String> lst = Arrays.asList("welcome","HELLO","Hai","Babu","Welcome","hello","name");
		List<String> lst = Arrays.asList("welcome","hello","Hai","Babu","weacome","hello","name","Babu");
		
		//Display all string objects into lower case
		
		List<String> lower= lst.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
		for(String s : lower)
			System.out.println(s);
		
		//Display all string objects into upper case
		List<String> upper= lst.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		
		//Display the strigs whose letter starts with "w"//It will display only welcome
		List<String> match= lst.stream().filter(x->x.startsWith("w")).collect(Collectors.toList());
		System.out.println(match);
		
		//Display the strigs whose letter starts with "w"//It will display only welcome
		List<String> match1= lst.stream().filter(x->x.startsWith("Ba")).collect(Collectors.toList());
		System.out.println(match1);
		
		//Display the strigs which it has endwith "e"
		List<String> endwith= lst.stream().filter(x->x.endsWith("e")).collect(Collectors.toList());
		System.out.println(endwith);
		
		
		//Display the strigs in descending order
		List<String> descorder= lst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descorder);
		
		//Display the strigs in ascending order
		List<String> ascOrder= lst.stream().sorted().collect(Collectors.toList());
		System.out.println(ascOrder);
				
		//Display the strigs which it has ""com" word order
		List<String> contains1= lst.stream().filter(x->x.contains("com")).collect(Collectors.toList());
		System.out.println(contains1);
		
		//Display the strigs which it has ""com" word order and with limit1
		List<String> containslimit= lst.stream().filter(x->x.contains("com")).limit(1).collect(Collectors.toList());
		System.out.println(containslimit);
		
		//Display the distinct strings
		List<String> distinct= lst.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		//Display the distinct strings using set
		Set<String> distinct1= lst.stream().map(x->x).collect(Collectors.toSet());
		System.out.println(distinct1);
		
		
		List<String> contains21= lst.stream().filter(x->x.contains("com")).collect(Collectors.toList());
		System.out.println(contains1);
		

	}

}
