package in.recursion;

public class Session_1 {
	
	
	   
	    public static void main(String[] args) {
	        int n = 5; // Replace 5 with the desired value
	        int result = sumNumbersRecursive(n);
	        System.out.println("The sum of numbers from 0 to " + n + " is " + result);
	    }


	    public static int sumNumbersRecursive(int n) {
	        if (n == 0) {
	            return 0;
	        } else {
	            return n + sumNumbersRecursive(n - 1);
	        }
	    }

}
