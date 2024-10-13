package com.array;

import java.util.Arrays;
import java.util.List;

public class Launch_ListOf {

	public static void main(String[] args) {
		//stores immutable elements in list
		
		List<Integer> list = List.of(10,20,30);
		System.out.println(list);
		list.add(40); //throws UnsupportedOperationException
		System.out.println(list);
		
	}

}
