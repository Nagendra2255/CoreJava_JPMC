package com.ariba;

import java.util.*;
final class immu
{
	final int id;
	final List<Integer> lst;
	
	public final int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public List<Integer> getLst() {
		//return Collections.unmodifiableList(new ArrayList<Integer>(this.lst));
		List<Integer> lst1 = Collections.unmodifiableList(new ArrayList<Integer>(this.lst));
		return lst1;
	}
	/*public void setLst(List<Integer> lst) {
		this.lst = lst;
	}*/
	
	@Override
	public String toString() {
		return "immu [id=" + id + ", lst=" + lst + "]";
	}
	public immu(int id, List<Integer> lst) {
		
		
		//return Collections.unmodifiableList(new ArrayList<Integer>(this.lst));
		List<Integer> lst1 = new ArrayList<Integer>();
		this.id = id;
		this.lst = lst1;
	}
	
	
}

public class ImmutableArrayList {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);l.add(70); l.add(900);
		
		immu i = new immu(20,l);
		System.out.println(l);
		//i.id=200;
		l.add(100);
		System.out.println(l);
		
	}

}
