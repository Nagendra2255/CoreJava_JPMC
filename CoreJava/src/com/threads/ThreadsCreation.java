package com.threads;

class MyownThreadClass2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
}


class MyownThreadClass extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
}

class MyownThreadClass1 extends MyownThreadClass implements Runnable 
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"..."+i);
		}
	}
}

public class ThreadsCreation {

	public static void main(String[] args) {
		
		
	
		/*Thread t1 = new Thread(new MyownThreadClass1());
		Thread t2 = new Thread(new MyownThreadClass1());
		Thread t3 = new Thread(new MyownThreadClass1());
		Thread t4 = new Thread(new MyownThreadClass1());
		Thread t5 = new Thread(new MyownThreadClass1());*/
		//OR like below
		MyownThreadClass1 tt1 = new MyownThreadClass1();
		MyownThreadClass1 tt2 = new MyownThreadClass1();
		MyownThreadClass1 tt3 = new MyownThreadClass1();
		MyownThreadClass1 tt4 = new MyownThreadClass1();
		MyownThreadClass1 tt5 = new MyownThreadClass1();
		
		Thread t1 = new Thread(tt1); 
		Thread t2 = new Thread(tt2); 
		Thread t3 = new Thread(tt3); 
		Thread t4 = new Thread(tt4); 
		Thread t5 = new Thread(tt5); 
		t1.setPriority(10);
		t1.setName("DIVYA");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
