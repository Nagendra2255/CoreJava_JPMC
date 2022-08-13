package com.java8.interviw;

import java.util.Arrays;
import java.util.List;

class Nagendra1
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
	public Nagendra1(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class Java8Practise {

	public static void main(String[] args) {
		Nagendra1 e1 = new Nagendra1(200,"Nagu",123.45f); Nagendra1 e2 = new Nagendra1(10,"Satish",98.45f);
		Nagendra1 e3 = new Nagendra1(700,"AMadhu",145.45f); Nagendra1 e4 = new Nagendra1(20,"Vignan",189.45f);
		Nagendra1 e5 = new Nagendra1(900,"Ramesh",100.45f); Nagendra1 e6 = new Nagendra1(800,"Ruthvika",191.45f);
		Nagendra1 e7 = new Nagendra1(800,"Ruthvika",192.45f);
		
		List<Nagendra1> lst = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		//MAX SALARY
		Float max = lst.stream().map(Nagendra1::getSalary).max(Float::compare).get();
		System.out.println(max);
		
		//MAX SALARY
		Float min = lst.stream().map(Nagendra1::getSalary).min(Float::compare).get();
		System.out.println(min);
		
		//MAX SALARY
		List<Nagendra1> lst1 = lst.stream().filter(Nagendra1::getSalary).comparingFloat(Float::compare).get();
		System.out.println(min);
		
	}

}
