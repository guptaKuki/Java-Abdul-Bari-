package CollectionFramework;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>(List.of(10,30,50,70,10,40));
		
		System.out.println(ts);

		System.out.println(ts.ceiling(45)); // it will give the next nearest number present in list.(if number itself is not present)
		}

}
