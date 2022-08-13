package com.ariba;

class OneObject implements Cloneable
{
	private static OneObject one=null;// This is Lazy loading
	// or private static OneObject one= new OneObject;// This is eager loading
	
	
	private OneObject()
	{
		
	}
	public static OneObject getInstance()
	{
		
		if(one==null)
		{
			synchronized(OneObject.class)
			{
				if(one==null)
				{
			
		 one=new OneObject();
		 
				}
			}
		}
		 return one;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{

		throw new CloneNotSupportedException(); 
	}
}

public class Singleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		OneObject o1=OneObject.getInstance();
		OneObject o2=OneObject.getInstance();
		OneObject o3=(OneObject) o1.clone();
		System.out.println(o1.hashCode()+"..."+o2.hashCode()+"...."+o3.hashCode());

	}

}
