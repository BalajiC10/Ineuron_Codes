package com.pattern;

public class Print_Ineuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("\t");
			for(int k=0;k<n;k++) {
				
				if(k==0 || k==n-1 || k==1 && i==1 || k==2 && i==2 || k==n-2 && i==3 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int l=0;l<n;l++) {
				
				if(l==0 || i==0 || i==n-1 || i==(n-1)/2 && l!=n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			for(int m=0;m<n;m++) {
				
				if(m==0 && i!=n-1 || i==n-1 && m!=0 && m!=n-1 || m==n-1 && i!=n-1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int p=0;p<n;p++) {
				
				if(p==0 || p==1 && i==2 || p==1 && i==0 || p==2 && i==0 || p==2 && i==2 || p==3 && i==1 || p==3 && i==n-2 || p==4 && i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int o=0;o<n;o++) {
				
				if(o==0 && i!=0 && i!=n-1 || i==0 && o!=0 && o!=n-1 || o==n-1 && i!=n-1 && i!=0 || i==n-1 && o!=0 && o!=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int h=0;h<n;h++) {
				if(h==0 || h==n-1 || h==1 && i==1 || h==2 && i==2 || h==n-2 && i==3 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
