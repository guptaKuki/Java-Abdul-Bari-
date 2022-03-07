package CollectionFramework;

import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {
	
		ArrayList<Integer> al1=new ArrayList<>(20);
		
		ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90)); // List.of is a static method.
		
		al1.add(10);
		al1.add(0, 5);
		
		al1.addAll(1, al2);
		System.out.println(al1);
		
		System.out.println(al1.contains(60));
		
	System.out.println(al1.get(4));
	System.out.println(al1.indexOf(50));
	
	al1.set(6, 100);
	System.out.println(al1); 
	
	//iteration
	for(int i=0;i<al1.size();i++) {
		System.out.print(al1.get(i)+" "); // we cannot use al1[i] because it is an object of generic class. 
	} 
	System.out.println();
	
		for(var x:al1)
			System.out.print(x+" ");
		
		System.out.println();
		
//		Iterator<Integer> it= al1.iterator();
//			while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//			}
		
		ListIterator<Integer> it= al1.listIterator(); // ListIterator is bi-directional where as iterator is uni-directional.
		while(it.hasNext()) {
		System.out.print(it.next()+" ");
		}
		
		// for(ListIterator<Integer> it =al1.listIterator(); it.hasNext();) {}
		// Here we just convert while loop into for loop
		
		System.out.println();
		al1.forEach((x)->{ //Lambda Expression
			System.out.print(x+" ");
		});
		
	}
	

}
 