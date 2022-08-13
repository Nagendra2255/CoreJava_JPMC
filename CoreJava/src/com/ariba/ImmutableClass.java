package com.ariba;
final class Immutable
{
	private final int empId;
	private final String empName;
	private Address address;
	
	public Address getAddress() {
		//This approach is not good. Bcz if i add new field in Address then i have to change Student and main class and whereever Address class is using.
		//return new Address(address.getDoorNo(),address.getStreetName());
		return new Address(address);
		
	}

	@Override
	public String toString() {
		return "Immutable [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public Immutable(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	
	
}

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address adr = new Address(100,"HYDERABAD");
		Immutable im = new Immutable(100,"Nagu",adr);
		System.out.println("..."+im);
		Address adr1=im.getAddress();
		System.out.println(adr.hashCode()+"  "+adr1.hashCode());//Different hashcodes, means its returning proxy or cloned object
		im.getAddress().setStreetName("BANGALORE");
		System.out.println("..."+im);
		

	}

}
