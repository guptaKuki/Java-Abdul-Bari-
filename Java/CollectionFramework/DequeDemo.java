package CollectionFramework;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> dq= new ArrayDeque<>();
		
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		dq.offerLast(50);
		
		//dq.pollLast(); // act like stack ( insert from last and delete from last)
		//dq.pollFirst(); // acts like queue (insert from last and delete from first)
		
		dq.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		dq.offerFirst(4);
		
		dq.forEach(x->System.out.print(x+" "));
	}

}
