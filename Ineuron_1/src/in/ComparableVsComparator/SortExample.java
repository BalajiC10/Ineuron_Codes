package in.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
	
	/*
	 *
	 * Comparable:-Single logic sorting (Can compare only single entity or object at a time)
	 * Used for custom sorting
	 */
	
	private String name;
	private String phone;
	private int sId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public Emp(String name, String phone, int sId) {
		super();
		this.name = name;
		this.phone = phone;
		this.sId = sId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", sId=" + sId + "]";
	}
	
	
	@Override
	public int compareTo(Emp o) {
		
		//return this.sId-o.sId;
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
}
public class SortExample {
public static void main(String[] args) {
	
		ArrayList<Emp> Empls = new ArrayList<>();
		
		Emp s1 = new Emp("Balaji", "893893", 23);
		Emp s2 = new Emp("Rohan", "982398", 24);
		Emp s3 = new Emp("Vasu", "89473", 20);
		Emp s4 = new Emp("Sarish", "8644", 18);
		Emp s5 = new Emp("Indu", "6873", 29);
		
		Empls.add(s1);
		Empls.add(s2);
		Empls.add(s3);
		Empls.add(s4);
		Empls.add(s5);
		
		System.out.println(Empls);
		
		System.out.println("sorted as per Id's. or Name");
		Collections.sort(Empls); //sorted as per Id's.
		System.out.println();
		System.out.println(Empls);
		
}
}
