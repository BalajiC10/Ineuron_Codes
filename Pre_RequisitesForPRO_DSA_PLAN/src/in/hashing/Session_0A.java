  package in.hashing;

import java.util.Scanner;

public class Session_0A {
public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter size of an Array: ");
		
		int n = 5;
		
		int arr[] = {1,2,4,3,3};
	
		int brr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			brr[arr[i]]++;
			
			
		}
		int maxE=brr[0],maxF=0;
		int min=Integer.MAX_VALUE;
		int minE=0;
		for(int j=0;j<brr.length;j++) {
			if(maxF<brr[j]) {
				maxE=j;
				maxF=brr[j];
			}
			if(min>brr[j] && brr[j]!=0) {
				//System.out.println(brr[k]);
				min=brr[j];
				minE=j;
			}

			
		}
		
		
		
		System.out.println(maxE+"-->"+maxF);
		System.out.println(minE+"-->"+min);
		
		
		
		
}
}
