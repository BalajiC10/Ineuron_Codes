package in.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Launch1 {
	
public static void main(String[] args) {
	
	List<Integer>  nums= Arrays.asList(6,5,2,8,1,7);
	System.out.println(nums);
	int res=0;
	
	Stream<Integer> stream1 = nums.stream(); //Only one time you can use any stream 
	
//	Predicate<Integer> pred = new Predicate<Integer>() {
//		
//		public boolean test(Integer n) {
//			if(n%2!=0) {
//				
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//	};
//	Stream<Integer> stream1 = stream.filter(pred);
	
	Stream<Integer> stream2 = stream1.filter(n->n%2==1);
	
	//stream2.forEach(n->System.out.println(n));
	
	//map()
	
//	Function<Integer,Integer> func = new Function<Integer,Integer>() {
//
//		@Override
//		public Integer apply(Integer t) {
//			
//			return t=t*3;
//		}
//	
//	};
//	Stream<Integer> stream3 = stream2.map(func);
	
	
	 Stream<Integer> stream3 = stream2.map(n->n*3);
	 
//	 stream3.forEach(n->System.out.println(n));
	 
	 
	 //reduce()
//	 BinaryOperator<Integer> sys = new BinaryOperator<Integer>() {
//		 
//		 @Override 
//		public Integer apply(Integer t, Integer u) {
//			// TODO Auto-generated method stub
//			return t+u;
//		}
//
//		
//	 };
	 
	 int result = stream3.reduce(0, (t,u)->t+u	);
	 System.out.println(result);
	 
	 
			
			
		
}
}
