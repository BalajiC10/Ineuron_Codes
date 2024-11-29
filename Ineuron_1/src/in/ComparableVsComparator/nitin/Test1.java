package in.ComparableVsComparator.nitin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	
	public static void main(String[] args) {
		
			ArrayList<Integer> nums = new ArrayList();
			
			nums.add(10);
			nums.add(20);
			nums.add(40);
			nums.add(15);
			nums.add(28);
			nums.add(50);
			
			System.out.println(nums);
			
			List<Integer> sortedList = nums.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedList);
			
			List<Integer> comparable = nums.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
			System.out.println(comparable);
			
			Integer minvalue = nums.stream().min((i1,i2)->i1.compareTo(i2)).get();	
			
			System.out.println("Min value: "+minvalue);
			
			Integer maxValue = nums.stream().max((i1,i2)->i1.compareTo(i2)).get();
			System.out.println("Max Value: "+maxValue);
			
			
			
			
			
			
	}
}
