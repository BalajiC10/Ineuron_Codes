package in.map1;
import java.util.*;

public class DiffHashAndIdentityHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1 = new HashMap();
		map1.put(10, "Sachin");
		map1.put(10, "Balaji");
		
		System.out.println(map1);
		
		IdentityHashMap<Integer, String> map2 = new IdentityHashMap();
		map2.put(10, "Sachin");
		map2.put(10, "Balaji");
		
		System.out.println(map2);
		
		
	}

}
