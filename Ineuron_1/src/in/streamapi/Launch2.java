package in.streamapi;

import java.util.Arrays;
import java.util.List;

public class Launch2 {

	public static void main(String[] args) {
		
			List<Integer> nums = Arrays.asList(2,4,7,3,5,9,6,1);
			//Integermediate & termination functions
			int result = nums.stream()
					.filter(n-> n%2==1)
					.map(n->n*2)
					.reduce(0, (s,e)->s+e);
			
			
			System.out.println(result);
			
	}
}
