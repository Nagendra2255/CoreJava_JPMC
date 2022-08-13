package com.threads;

class MyownThreadClass22 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			try {
				Thread.sleep(10000);
				System.out.println(Thread.currentThread().getName()+"  "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SleepMethod {

	public static void main(String[] args) {
		
		MyownThreadClass22 t1 = new MyownThreadClass22();
		MyownThreadClass22 t2=new MyownThreadClass22();
		MyownThreadClass22 t3=new MyownThreadClass22();
		t1.setName("T1 Thread");
		t2.setName("T2 Thread");
		t3.setName("T3 Thread");
         t1.start();
        
		 t2.start();
		
		 t3.start();
		
	}

}
