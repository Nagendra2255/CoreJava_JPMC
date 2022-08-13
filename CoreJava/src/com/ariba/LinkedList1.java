package com.ariba;

class Node
{
	int data;
	Node next;
}

public class LinkedList1 {
	
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
			head=node;
		else
		{
			Node n= head;
			while(n.next!=null)
				n=n.next;
			n.next=node;
		}
			
	}
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList1 l = new LinkedList1();
		l.insert(10); l.insert(4); l.insert(34);
		l.show();

	}

}
