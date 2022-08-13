package com.vignan;

public class Address {
	int doorno;
	String city;
	String state;
	
	public Address(int doorno, String city, String state) {
		super();
		this.doorno = doorno;
		this.city = city;
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", city=" + city + ", state=" + state + "]";
	}
	public Address()
	{
		
	}
	

}
