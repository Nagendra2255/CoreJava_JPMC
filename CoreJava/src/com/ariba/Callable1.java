package com.ariba;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Runnabletask implements Runnable
{

	@Override
	public void run() {
		System.out.println("Run method...");
		
	}
	
}

class Callabletask implements Callable
{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Call method...");
		//return 1;
		return new Random().nextInt();
	}
	
}

public class Callable1 {

	public static void main(String[] args) throws TimeoutException {
		// TODO Auto-generated method stub
		ExecutorService exe = Executors.newFixedThreadPool(3);
		exe.submit(new Runnabletask()); //or exe.execute(new Runnabletask()); Runnable will take execute() and submit()
		exe.execute(new Runnabletask());
		
		ExecutorService exe1 = Executors.newSingleThreadExecutor();
		Future<Integer> result = exe1.submit(new Callabletask());//Callable will take only submit() method.
		//Note: once we submit the future task , we can do some other parellel operations, once future task is ready then we can print results.
		//Both submit() and execute() methods are used to submit a task to the Executor framework for asynchronous execution
		try {
			Integer finalresult = result.get(10, TimeUnit.SECONDS);//It will wait 10 seconds.
			if(result.isDone())
			System.out.println("Final result is..."+finalresult);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
