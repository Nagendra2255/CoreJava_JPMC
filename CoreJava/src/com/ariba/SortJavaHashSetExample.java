package com.ariba;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 
class Subject{
    
    public int empId;
    public String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Subject(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Subject [empId=" + empId + ", empName=" + empName + "]";
	}
    
    
}
 
/*
 * A custom comparator for the Subject class to
 * sort the objects in an ascending order.
 */
class SubjectComparator implements Comparator<Subject>{
 
    /*
     * This method will sort the Subject objects in the
     * ascending order
     */
    public int compare(Subject s1, Subject s2) {
    	if(s1.empId==s2.empId)
			return 0;
		else if(s1.empId>s2.empId)
			return 1;
		else
			return -1;
    }    
}
 

 
public class SortJavaHashSetExample {
    
    public static void main(String[] args) {
        
        Set<Subject> hSetSubjects = new HashSet<Subject>();
        
        hSetSubjects.add( new Subject(2,"hxc"));
        hSetSubjects.add( new Subject(4,"jjk"));
        hSetSubjects.add( new Subject(3,"wsd"));
        hSetSubjects.add( new Subject(5,"opj"));
      
        
        System.out.println("HashSet contains: ");
        System.out.println(hSetSubjects);
        
        /*
         * Create new TreeSet with ascending order comparator
         */
        TreeSet<Subject> treeSetSubjectsAsc = new TreeSet<Subject>(new SubjectComparator());
        
        //add all elements of HashSet to TreeSet
        treeSetSubjectsAsc.addAll(hSetSubjects);
        
        System.out.println("Sorted HashSet in ascending order: ");
        System.out.println(treeSetSubjectsAsc);
        
        //similarly, sort HashSet in descending order
        TreeSet<Subject> treeSetSubjectsDesc = new TreeSet<Subject>(new SubjectComparatorDescending());
        treeSetSubjectsDesc.addAll(hSetSubjects);
        
        System.out.println("Sorted HashSet in descending order: ");
        System.out.println(treeSetSubjectsDesc);
    }
}
