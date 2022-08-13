package com.tests;

import java.util.ArrayList;

class n implements Runnable
{
public void run()
{
	System.out.println("running");
}
}
public class mm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t = new Thread(new n());
t.run();t.run();t.start();

ArrayList o = new ArrayList();
o.add("A"); o.add("D"); o.ensureCapacity(3);o.trimToSize();
System.out.println(o.size());

ArrayList<Integer>
arrlist = new ArrayList<Integer>();
arrlist.add(10);
arrlist.add(20);
arrlist.add(30);
arrlist.add(40);

// Print the ArrayList
System.out.println("ArrayList: "
                   + arrlist);

// ensure that the ArrayList
// can hold upto 5000 elements
// using ensureCapacity() method
arrlist.ensureCapacity(5000);
System.out.println("size...."+arrlist.size());
	}

}
