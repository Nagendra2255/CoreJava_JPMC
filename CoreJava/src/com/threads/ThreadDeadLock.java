package com.threads;

class A
{
	public synchronized void foo(B b)
	{
		System.out.println("Thread1 starts the execution foo method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread1 trying to call b.last() method");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A, This is a last() method");
	}
}


class B
{
	public synchronized void bar(A a)
	{
		System.out.println("Thread2 starts the execution bar method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread2 trying to call a.last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, This is a last() method");
	}
}
public class ThreadDeadLock  implements Runnable
{
	A a = new A();
	B b = new B();
	ThreadDeadLock()
	{
		Thread t = new Thread(this);
		t.start();
		a.foo(b);
				
	}
	@Override
	public void run()
	{
		b.bar(a);
	}

	public static void main(String[] args) {
		//Thread t1=new Thread();
		new ThreadDeadLock();
		
		
	}

}
