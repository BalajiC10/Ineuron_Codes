package in.twopointer;

import java.util.Scanner;

public class Session_0 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        long k = scanner.nextLong();
	        long[] b = new long[n];
	        
	        for (int i = 0; i < n; i++) {
	            b[i] = scanner.nextLong();
	        }
	        
	        long count = 0;
	        long sum = 0;
	        for (int i = 0, j = 0; j < n; j++) {
	            sum += b[j];
	            while (sum > k) {
	                sum -= b[i];
	                i++;
	            }
	            count += (j - i + 1);
	        }
	        
	        System.out.println(count);
	        scanner.close();
	    }
	}


