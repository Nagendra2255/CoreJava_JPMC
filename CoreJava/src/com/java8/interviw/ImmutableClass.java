package com.java8.interviw;

final class immutable
{
	final int id;
	final String name;
	final float salary;
	final ImmutableAddress addr;
	public ImmutableAddress getAddr() {
		return new ImmutableAddress(addr);//Copy constructor
		//return addr;
		//return new ImmutableAddress(addr.getDoorno(),addr.getCity());//This is one way. But we should not change in this class
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "immutable [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}

	public immutable(int id, String name, float salary, ImmutableAddress addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr=addr;
	}
	

	
	
}

public class ImmutableClass {

	public static void main(String[] args) {
		ImmutableAddress addr = new ImmutableAddress(222,"Hyderabad");
		
		immutable i = new immutable(100,"Nagu",123.23f,addr);
		System.out.println(i);
		ImmutableAddress change = i.getAddr();
		change.setDoorno(111);
		change.setCity("Bangalore");
		System.out.println(i);
		
		System.out.println(i);

	}

}
