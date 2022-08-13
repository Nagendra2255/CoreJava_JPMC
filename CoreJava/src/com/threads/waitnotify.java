package com.threads;

class Customer
{
	static int balance=10000;
	
	public synchronized void withdraw(int amount)
	{
		if(amount>balance)
		{
			System.out.println("Less balance; waiting for deposit...");    
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	

		}
		
			balance = balance-amount;
		
		System.out.println("Withdraw completed..."+amount);
	}
	
	public synchronized void deposit(int amount)
	{
	
	System.out.println("Goint to deposit..");
	balance = balance+amount;
	System.out.println("deposit completed... "+amount);    
	notify();  
	
	}
}

public class waitnotify {

	public static void main(String[] args) {
		Customer c = new Customer();
		Thread t1 = new Thread() {
			@Override
			public void run()
			{
				System.out.println("T1...");
				c.deposit(10000);
				
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run()
			{
				System.out.println("T2...");
				c.withdraw(150000);
				
			}
		};
		t2.start();
		
		
		
	}

}
/*
T1...
T2...
Less balance; waiting for deposit...
Goint to deposit..
deposit completed... 1000
Withdraw completed...15000  */
