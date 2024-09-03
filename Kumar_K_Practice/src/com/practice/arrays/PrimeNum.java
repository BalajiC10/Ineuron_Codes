package com.practice.arrays;
import java.util.*;
public class PrimeNum {
public static void main(String[] args) {
	 	List l = new ArrayList();
		for(int i=0;i<=100;i++) {
			int temp=0;
			
			for(int j=2;j<i-1;j++) {
				
				if(i%2==0) {
					temp+=1;
				}
				
				
			}
			
			if(temp>0) {
				
				temp=0;
			}
			else {
				l.add(i);
			}
		}
		System.out.println(l);
}
}
