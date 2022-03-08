package CollectionFramework;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.remove(50);
		System.out.println(hs);
	}

}
