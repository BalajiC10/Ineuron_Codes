package in.streamapi;

import java.util.stream.Stream;

public class Test3 {
public static void main(String[] args) {
	
		
		Stream s1 = Stream.of(10,20,30,40,50);
		s1.forEach(data->System.out.println(data));
		
		Double 	[] d = {10.0, 2.3, 20.0, 30.5, 45.5};
		Stream d1 = Stream.of(d);
		
		d1.forEach(data->System.out.println(data));
		
		
}
}
