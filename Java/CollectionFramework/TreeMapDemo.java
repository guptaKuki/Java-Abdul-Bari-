package CollectionFramework;

import java.util.*;
import java.util.Map.*;

public class TreeMapDemo {

public static void main(String[] args) {
		
		TreeMap<Integer,String> tm= new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
		
		//HashMap<Integer,String> tm= new HashMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
		
		tm.put(5, "E");
		tm.put(6, "F");
		
		System.out.println(tm.ceilingEntry(5).getValue());
		System.out.println(tm.get(3));
		
		System.out.println(tm);

		Entry<Integer,String> e= tm.firstEntry();  // Entry is not present in HashMap
		System.out.println(e.getKey()+" "+e.getValue());
		
	}

}
