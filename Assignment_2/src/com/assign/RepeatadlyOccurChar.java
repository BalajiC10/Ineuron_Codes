
package com.assign;

public class RepeatadlyOccurChar {
public static void main(String[] args) {
	
		String s = "SachinRameshTendulkar";
		
		System.out.println("Repeatadly occuring chars: ");
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.print(s.charAt(i)+" ");
				}
			}
		}
}
}
