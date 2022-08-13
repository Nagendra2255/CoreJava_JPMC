package com.tests;

 class newthread1 extends Thread{
	Thread t1,t2;
	newthread1()
	{
		t1=new Thread(this,"thread1");
		t2=new Thread(this,"thread2");
		t1.start();
		t2.start();
	}
	public void run()
	{
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.equals(t2));
	}
}
class newthread
{

	public static void main(String[] args) {
		new newthread1();
	}

}
