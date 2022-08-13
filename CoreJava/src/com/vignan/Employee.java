package com.vignan;


public class Employee {
		int empId;
		String empName;
		Address adr;
		
	
		
		public int getEmpId() {
			return empId;
		}



		public void setEmpId(int empId) {
			this.empId = empId;
		}



		public String getEmpName() {
			return empName;
		}



		public void setEmpName(String empName) {
			this.empName = empName;
		}



		public Address getAdr() {
			return adr;
		}



		public void setAdr(Address adr) {
			this.adr = adr;
		}



		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", adr=" + adr + "]";
		}



		public Employee(int empId, String empName, Address adr) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.adr = adr;
		}
		public Employee()
		{
			
		}



		public static void main(String args[])
		{
			System.out.println("Welcome.....");
			Address adr=new Address();
			adr.setDoorno(111);adr.setCity("BANGALORE");adr.setState("AP");
			
			Employee e2=new Employee(100,"nnn",adr);
			System.out.println(e2);
			
			Address adr1=new Address();
			adr1.setDoorno(222);adr1.setCity("HYDERABAD");
			adr1.setState("KARNATAKA");
			Employee e3=new Employee(200,"XXX",adr1);
			System.out.println(e3);
			
		

	}


}
