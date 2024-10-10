package in.map1;
import java.util.*;

public class FindMinMax {
public static void main(String[] args) {
	
		int arr[] = {3,2,3,2,4,3};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int maxv=arr[0], maxk=Integer.MIN_VALUE;
		int minv=arr[0], mink=Integer.MAX_VALUE;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			int key = entry.getKey();
			int value = entry.getValue();
			
			if(value>=maxv) {
				maxv = value;
				maxk=key;
			}
			if(value<minv) {
				minv = value;
				mink=key;
			}
			
			
		}
		
		System.out.println(map);
		System.out.println(maxv);
		System.out.println(minv);
		
}
}
