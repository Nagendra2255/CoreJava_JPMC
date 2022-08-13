package com.ariba;

class Simple1{ 
	public static boolean test(Simple1 s)
	{
	
	if (!(s instanceof Simple1));//true
	 return true;
	 
	}
	 public static void main(String args[]){  
	 Simple1 s=new Simple1();  
	 try {
		try {
			boolean o=Simple1.test(new Simple1());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 }  
	}  