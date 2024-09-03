package com.practice.arrays;

public class Count_e_od_triplet_sum {
public static void main(String[] args) {
	
		int sum=0;
		int ec=0,oe=0;
		int ar[]= {3,7,5,9,1};
		      //   0 1 2 3 4
		for(int i=0;i<ar.length-2;i++) {
			
			for(int j=i+1;j<ar.length-1;j++) {
				for(int k=j+1;k<ar.length;k++) {
					
					sum+=ar[i]+ar[j]+ar[k];
					if(sum%2==0) {
						ec++;
						
					}
					else {
						oe++;
					}
				}
			}
		}
		System.out.println(ec+" "+oe);
}
}
