package com.hacker;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {1, 2, 3, 4, 5, 6 };
		//int j=ar[1];
		for(int i=0;i<ar.length-1;i++) {
			
			for(int j=1;j<ar.length-1;j++) {
				
				int num= ar[i]+ar[j];
				
				if(num%5==0) {
					System.out.println(ar[i]+" "+ar[j]);
					
					j++;
				}
			}
			//break;
			//System.out.println("===============");
		}
		
		
	}

}
