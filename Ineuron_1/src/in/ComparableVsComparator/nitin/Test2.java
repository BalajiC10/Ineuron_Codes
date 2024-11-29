package in.ComparableVsComparator.nitin;

import java.util.ArrayList;

public class Test2 {
public static void main(String[] args) {
	
	ArrayList<String> names = new ArrayList();
	names.add("AAA");
	names.add("BBB");
	names.add("CCC");
	names.add("DDD");
	
	names.stream().forEach(data->System.out.println(data));
}
}
