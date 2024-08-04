package com.assign;
import java.util.*;
public class SortString {
public static void main(String[] args) {
	
		String str = "dcba";
		
		char arr[] = str.toCharArray();
		
		ArrayList <Character> list = new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			list.add(str.charAt(i));
		}
		
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		
}
}
