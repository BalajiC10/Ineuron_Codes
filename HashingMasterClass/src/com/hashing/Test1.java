package com.hashing;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		List aa = new ArrayList();
		aa.add(10);
		aa.add(20);
		aa.add(30);
	
		
		List bb = new ArrayList();
		bb.set(0,aa.get(aa.size()-1));
		
		
		for(int i=1;i<bb.size()-2;i++) {
			
			System.out.println(bb.get(i));
		}
		
		System.out.println(bb);
		
		
		
		
		
		
	}
}
