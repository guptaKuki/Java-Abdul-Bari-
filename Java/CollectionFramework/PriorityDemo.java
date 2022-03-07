package CollectionFramework;

import java.util.*;

public class PriorityDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);
		
		pq.forEach(x-> System.out.print(x+" "));
		
		//After deletion of first element
		System.out.println();
		
		pq.poll();
		pq.forEach(x-> System.out.print(x+" "));
	}

}
