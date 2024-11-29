package in.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
public static void main(String[] args) {
		System.out.println("Power of Stream & Lamba Expression ");
		
		
		List<String> list = new ArrayList();
		
		list.add("Radha");
		list.add("Krishna");
		list.add("Ram");
		list.add("Balaji");
		list.add("Govind");
		list.add("Venkateshwara");
		list.add("Gopichand");
		
		List<String> listName = list.stream().filter(i->i.length()<=5).collect(Collectors.toList());
		System.out.println(listName); //Predicate -->public abstract boolean test()
		
		List<String> mapResult = list.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(mapResult); //Function --> public abstract R apply(T)
		
		long count = list.stream().filter(i->i.length()<6).count();
		System.out.println(count);
		 
		
}
}
