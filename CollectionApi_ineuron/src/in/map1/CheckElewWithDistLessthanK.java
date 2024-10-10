package in.map1;
import java.util.*;

public class CheckElewWithDistLessthanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Check if there are any two Equal numbers in an array at a distance less than or equal to k
		 */
		
		int arr[] = {1, 4,5, 1, 3, 1, 2, 3};
		int k =2;
		
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<arr.length;i++) { //0-4 
			
			int ce = arr[i];
			
			if(map.containsKey(ce) && i-map.get(ce)<=k) {
				
				
					System.out.println("Yes");
					return;
					
				
			}
			else {
				map.put(ce, 1);
			}
			
		}
		System.out.println("No");
		
		
	}

}
