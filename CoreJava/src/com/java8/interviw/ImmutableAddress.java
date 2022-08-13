package com.java8.interviw;

public class ImmutableAddress {
	
	int doorno;
	String city;
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
		return "ImmutableAddress [doorno=" + doorno + ", city=" + city + "]";
	}
	public ImmutableAddress(int doorno, String city) {
		super();
		this.doorno = doorno;
		this.city = city;
	}
	public ImmutableAddress()
	{
		
	}
	public ImmutableAddress(ImmutableAddress addr)
	{
		this(addr.getDoorno(),addr.getCity());
	}
	

}
