package com.mutableString;

public class CapacityMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());//16
		sb.append("abcdefghilmnop");
		System.out.println(sb.capacity());//16
		
		sb.append("q");
		System.out.println(sb.capacity());//(16+1)*2
		
		sb.append("rstuvwxyz");
		System.out.println(sb.capacity()); //34
		
		
		StringBuffer s1 = new StringBuffer(19);
		System.out.println(s1.capacity());//it will specify the capacity here.
		
		StringBuffer s2 = new StringBuffer("Sachin");
		System.out.println(s2.capacity());//22 (16+6)
		s2=s2.append("IND");
		System.out.println(s2.capacity());
		System.out.println(s2.length()); //6
		
		
		StringBuffer s3 = new StringBuffer();
		System.out.println(s3.capacity());
		
		s3.ensureCapacity(1000);
		System.out.println(s3.capacity());
		
		s3.append("abc");
		System.out.println(s3.capacity());
		
		//trim the capacity
		s3.trimToSize();
		System.out.println(s3.capacity());
		
	}

}
