package in.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(25);
		list.add(10);
		list.add(38);
		list.add(45);
		list.add(50);
		list.add(23);
		list.add(40);
		
		
		for(int i:list) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		List<Integer> evenList =list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		System.out.println(evenList.getClass().getName());
		
		List<Integer> mapInterface = list.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(mapInterface);
		
}
}
