package com.ariba;
import java.util.*;
class xxx
{
	int id;
	String name;
	public xxx(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		xxx other = (xxx) obj;
		return this.id==other.id && this.name.equals(other.name);
	}
	
}

public class HashMapTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<xxx, Integer> m = new HashMap<xxx,Integer>();
		xxx a1 = new xxx(100,"Nagendra");
		xxx a2 = new xxx(100,"Nagendra");
		m.put(a1, 100);
		m.put(a2,200);
		
		System.out.println(m.size());
		char c = 'c'+"ggg";

	}

}
