package com.threads;

class MyownThreadClass5 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("MyownThreadClass run method"+Thread.currentThread().getName()+"  "+i);
		}
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		MyownThreadClass5 t1 = new MyownThreadClass5();
		MyownThreadClass5 t2=new MyownThreadClass5();
		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		t1.start();
		t2.setPriority(2);
		t2.start();
		
		
	}

}
