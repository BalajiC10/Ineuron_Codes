package in.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session_0B {
public static void main(String[] args) {
			//Using HashMap to find freq of element and find max elemen and min element freq.
			Map<Integer,Integer> map = new HashMap();
			
//			//Time Complexity - O(n)
			//Space Complexity - O(n)

			int arr[] =  {1, 1, 2, 3, 3, 3};
			
			int maxiFreq = Integer.MIN_VALUE, maxiElement = arr[0];
	        int miniFreq = Integer.MAX_VALUE, miniElement = arr[0];
	        
	        for(int i=0;i<arr.length;i++) {
	        	
	        	if(map.containsKey(arr[i])) {
	        		map.put(arr[i], arr[i]+1);
	        	}
	        	else {
	        		map.put(arr[i], 1);
	        	}
	        }
	        
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
	        	System.out.println(entry.getKey()+"-->"+entry.getValue());
	        	
	        	if(entry.getValue()>=maxiFreq) {
	        		maxiFreq=entry.getValue();
	        		maxiElement =entry.getKey();
	        	}
	        	
	        	if(entry.getValue()<=miniFreq) {
	        		miniFreq=entry.getValue();
	        		miniElement=entry.getKey();
	        	}
	        	
	        	
	     
	        }
	        System.out.println("maxiElement:"+maxiElement+"-->"+"maxiFreq:"+maxiFreq);
	        System.out.println("miniElement:"+miniElement+"-->"+"miniFreq:"+miniFreq);
	 
			
}
}
