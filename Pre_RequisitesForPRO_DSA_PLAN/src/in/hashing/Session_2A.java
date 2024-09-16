package in.hashing;

public class Session_2A {
public static void main(String[] args) {
	
		/*
		 * Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
		 */
		//Brute Force
	
		int[] arr = {1, 2, 3, 4, 5};
		int k = 6;
		
		int  count=0;
		
		for(int i=0;i<arr.length-1;i++) { //1,2,3
			
			for(int j=i+1;j<arr.length;j++) { //2,3,4,5 //3,4,5 //4,5
				
				if(arr[i]+arr[j]==k) { //1+2=3,1+3=4,1+4=5,1+5=6,2+3=5,2+4=6,2=5=7,3+4=7,
					
					//System.out.println(arr[i]+","+arr[j]);
					count++; //1,2
				}
			}
		}
		System.out.println("Count is: "+count);
}
}
