package com.array;

import java.util.Arrays;
import java.util.List;

public class ArrayasList {
public static void main(String[] args) {
	
		
	/*
	 * Converts an array into a list backed by the array.
	 */
	
	String[] arr = {"A", "B", "C"};
	List<String> list = Arrays.asList(arr);
	list.set(0, "Z");  // This is allowed, modifying the underlying array
	System.out.println(arr[0]);  // Outputs "Z"

	// However, adding or removing elements is not allowed:
	list.add("D");  // Throws UnsupportedOperationException

		
}
}
