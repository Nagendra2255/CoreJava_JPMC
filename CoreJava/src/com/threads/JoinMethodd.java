package com.threads;

class MyownThreadClass11 extends Thread
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

public class JoinMethodd {

	public static void main(String[] args) throws InterruptedException {
		MyownThreadClass11 t1 = new MyownThreadClass11();
		MyownThreadClass11 t2=new MyownThreadClass11();
		MyownThreadClass11 t3=new MyownThreadClass11();
		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		t3.setName("T3 Thread");
         t1.start();
         t1.join();
		 t2.start();
		 t2.join();
		 t3.start();

	}

}
