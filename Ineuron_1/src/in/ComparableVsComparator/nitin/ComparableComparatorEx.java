package in.ComparableVsComparator.nitin;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Employe1 implements Comparable<Employe1>{
	
	/*
	 * Comparable (I):
		-Comparable Interface Present in java.lang Package and 
		-it contains Only One Method compareTo().
	 */
	
	@Override
	public int compareTo(Employe1 e1) {
		//Sort the Employe based on id if an emploe ascending order.
		int v1 = this.eid;
		int v2 = e1.eid;
		if(v1<v2) {
			return -5;
		}
		else if(v1>v2) {
			return 5;
			
		}
		else {
			return 0;
		}
	}
	
	int eid;
	String name;
	
	Employe1(int eid, String name){
		this.eid=eid;
		this.name=name;
		
	}

	

	@Override
	public String toString() {
		return "Employe1 [eid=" + eid + ", name=" + name + "]";
	}

}
	/*
     *
	 * Comprator - it is interface present interface java.util package
	 * 			 - Methods: -it contains two Methods compareTo() , equals()	
	 * 
	 * Note: If we are Not satisfied with Default Natural Sorting Order OR if Default
			 Natural Sorting Order is Not Already Available then
			 we can Define Our Own Sorting by using Comparator Object.
			 
	 public boolean equals(Object o);
			Whenever we are implementing Comparator Interface Compulsory we should
			Provide Implementation for compare().
			Implementing equals() is Optional because it is Already Available to Our
			Class from Object Class through Inheritance.
	 * */	

 

/*
 * 	Write a Program to Insert String and StringBuffer Objects into the TreeSet where
	Sorting Order is Increasing Length Order.
	If 2 Objects having Same Length then Consider their Alphabetical Order:
 */

class StringComparator implements Comparator<Employe1>{

	@Override
	public int compare(Employe1 o1, Employe1 o2) {
		//Sort the Name based on ALphabetical Order
		String s1 = o1.name;
		String s2 = o2.name;
		
		//Making the call to Compare to sort  the data in ascending order
		
		//return -s1.compareTo(s2); //Reverse Order
		return s1.compareTo(s2); //Normal Order
	}
	
}
public class ComparableComparatorEx {

	public static void main(String[] args) {
		
		//JVM uses Comparable  compareTo to sort id as per requirements
		//and Object should implements Comparable otherwise ClassCastException
		System.out.println("===============================Comparable=====================================");
		TreeSet t = new TreeSet();
		
		Employe1 e1 = new Employe1(10,"Balaji");
		Employe1 e2 = new Employe1(11,"Sarish");
		Employe1 e3 = new Employe1(20,"Virat");
		Employe1 e4 = new Employe1(15,"Vasudev");
		Employe1 e5 = new Employe1(10,"Rohit");
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);//java.lang.ClassCastException if not implemented comparable or comparator
		
		
		System.out.println("===============================Comparator=====================================");
		
		//JVM uses StringComparator (user defined Comprator)  compare to sort names as per requirements
		//and Object should implements Comparator otherwise ClassCastException
		TreeSet t1 = new TreeSet(new StringComparator()); //we need to pass class custom object here
		
		Employe1 e6 = new Employe1(10,"Balaji");
		Employe1 e7 = new Employe1(11,"Sarish");
		Employe1 e8 = new Employe1(20,"Virat");
		Employe1 e9 = new Employe1(15,"Ashish");
		Employe1 e10 = new Employe1(10,"Rohit");
		
		t1.add(e6);
		t1.add(e7);
		t1.add(e8);
		t1.add(e9);
		t1.add(e10);
		
		System.out.println(t1);
	}
}
