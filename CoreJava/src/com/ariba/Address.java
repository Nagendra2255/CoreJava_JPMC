package com.ariba;

public class Address {
	private int doorNo;
	private String streetName;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + "]";
	}
	public Address(int doorNo, String streetName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
	}
	//This is copy constructor This is good approach
	public Address(Address address)
	{
	this(address.getDoorNo(),address.getStreetName())	;
	}

}
