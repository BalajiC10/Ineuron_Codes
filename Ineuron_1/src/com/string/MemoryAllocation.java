package com.string;

public class MemoryAllocation {
public static void main(String[] args) {
	
		String s1= "Telusko"; //SCP+Heap
		
		String s2 = "iNeuron"; //SCP+Heap
		 
		String s3= "Telusko"+"iNeuron"; //SCP+Heap (allocates at compile time)
		 
		String s4 = s1+s2; //Heap area (Because reference is involved and it allocates at runtime)
		
		String s5 = s1+"iNeuron"; //Heap area (Because reference is involved)
		
		//we can check this using == method
		//if its true then both stored in SCP memory area
		//if not heap area
		
		System.out.println(s1==s2);//Both SCP  but values are diff so False
		System.out.println(s3==s5);//SCP and Heap area so False
		
		
		System.out.println(s1.toUpperCase());//output stores in heap area
		
		
		
		
		
}
}
