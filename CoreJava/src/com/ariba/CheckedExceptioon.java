package com.ariba;

//Class is a combilation of methods and properties 
class Employee2122
{
	// Instance Variables, It has default values. These variables should be inside the class
	int empId;
	String empName;
	float empSalary;
	
	//static variables, and it has default values.  These variables should be inside the class
	 static int strvariable;
	 
	 //It is a method
	public void emp()
	{
		//Local Variable, it does not have any default values. Before you use , those should be initialized
		 int x=10;
		System.out.println("employee class...."+x);
	}
	
	//It is a method
	public void emp123()
	{
		//Local Variable,these should be inside the method and should be initialized before we use
		int x;
		System.out.println("employee class...."+x);
	}
	
}

class Address1234
{
	int x=10;
	int y=20;
	int doorno;
	String city;
	String state;
	public void addr()
	{
		System.out.println("Address class....");
	}
	public void addition()
	{
		int z=x+y;
		System.out.println("Addition...."+z);
	}
	
}


class Calculator
{
	int x=30;
	int y=40;
	
	public void addition()
	{
		int z=x+y;
		System.out.println("Addition...."+z);
	}
	public void multiplication()
	{
		int z=x*y;
		System.out.println("Multiplication ...."+z);
	}
	public void substraction()
	{
		int z= x-y;
		System.out.println("substractioon ...."+z);
	}
	public void division()
	{
		int z= x/y;
		System.out.println("divisioon ...."+z);
	}
	
}



public class CheckedExceptioon {

	
	  public static void main(String[] args) {
	  
	  System.out.println("Welcome"); System.out.println("Welcome......");
	  
	  //Reference variables
	  
	  Employee2122 emp111 = new Employee2122();
	  Employee2122 emp222 = new Employee2122();
	  System.out.println(emp111.empId+"Name="+emp111.empName+"empsal="+emp111.
	  empSalary);
	  
	  Address1234 addr = new Address1234(); addr.addr(); emp111.emp();
	  
	  Calculator calc= new Calculator(); Calculator calc1= new Calculator();
	  System.out.println("CALCULATIOR CLASS DETAILS.......................");
	  System.out.println(calc.x); System.out.println(calc.y); calc.addition();
	  calc.substraction(); calc.multiplication(); calc.division();
	  
	  System.out.println("CALCULATIOR CLASS SECOND DETAILS......................."); 
	  System.out.println(calc1.x); System.out.println(calc1.y);
	  calc1.addition(); calc1.substraction(); calc1.multiplication();
	  calc1.division();
	  
	  
	  
	  }
	 

}
