package CollectionFramework;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListIterator {

	public static void main(String[] args) {
	
		ArrayList<Integer> al1=new ArrayList<>(20);
		
		ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
		
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
		System.out.print(al1.get(i)+" ");
	} 
		
		for(var x:al1)
			System.out.print(x+" ");
		
		al1.forEach((x)->{
			System.out.print(x+"  ");
		});
		
	}
	

}
 