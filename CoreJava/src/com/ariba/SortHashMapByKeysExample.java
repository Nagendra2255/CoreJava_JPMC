package com.ariba;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class Emp{
    
    private String id;
    private String name;
    private String department;
    private int age;
    
    public Emp(){        
    }
    
    public Emp(String id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
 
    //constructor with age argument
    public Emp(String id, String name, String department, int age){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getName() + 
            " : " + 
            this.getDepartment() + 
            "]";
    }
 
}

public class SortHashMapByKeysExample {
	 
    public static void main(String[] args) {
        
        //HashMap containing employee and it's manager mappings
        HashMap<Integer, Emp> hMapEmployeeManager = 
                new HashMap<Integer, Emp>();
        
        
        hMapEmployeeManager.put(500,
                new Emp("0033", "Carl", "IT"));
 
        hMapEmployeeManager.put(200,
                new Emp("0033", "Carl", "IT"));
 
        hMapEmployeeManager.put(100,
                new Emp("0033", "Carl", "IT"));
 
        hMapEmployeeManager.put(900,
                new Emp("0033", "Carl", "IT"));
 
       
 
         System.out.println("");
        
        //Create a new TreeMap with the custom Comparator
        TreeMap<Integer, Emp> treeMapEmployees =
                new TreeMap<Emp, Emp>(new EmpComparator());
        
        //put all elements of HashMap to TreeMap, thus sorting them
        treeMapEmployees.putAll(hMapEmployeeManager);
        
        //print TreeMap
        System.out.println("Sorted TreeMap Keys & Values");
        for(Emp e : treeMapEmployees.keySet()){
            System.out.println("Employee: " + e 
                    + ", Manager: " + treeMapEmployees.get(e));
        }
        
    }
}
 
class EmpComparator implements Comparator<Emp>{
    
    public int compare(Emp e1, Emp e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());        
    }    
}

