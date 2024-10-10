package in.map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
public static void main(String[] args) {
	
	/*
	 * Map: -it is not part of Collection
	 * 		-it will store values as (Key-Value) formate
	 * 		-Keys can not be duplicate
	 * 		-Values can be duplicate
	 * 		-it holds object in both (key-value) side.
	 * 		-it has 12 common methods
	 * 		-insetion order followed
	 */
	
	HashMap<Integer, String> hm = new HashMap();
	hm.put(10, "Sachin");
	hm.put(07, "Dhoni");
	hm.put(18, "Virat");
	hm.put(45, "Rohit");
	
	System.out.println(hm);
	
	Set keys = hm.keySet();
	System.out.println("Keys");
	System.out.println(keys);
	System.out.println("Values");

	
	Collection c = hm.values();
	System.out.println(c);
	
	/*
	 * Each key-value called an Entry
	 * Interface entry is defined Map Interface	 
	 */
	
	
	
	for(Map.Entry<Integer, String> entry: hm.entrySet()) {
		
		System.out.println(entry);
	}
}
}
