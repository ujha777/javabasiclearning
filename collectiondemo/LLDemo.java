package collectiondemo;

import java.util.LinkedList;

public class LLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LL is the bset choice if frequent operation is insertion or deletion in the middele 
		
		//LL is the worst choice if frequent operation is retrieve operation because of time consuming to find the address of the element
		//Underlying data structure is doubly linked list
		//insertion order is preserved
		//duplicates are allowed
		//hetregenouns element are allowed
		//null insertion is allowed
		//LL IMPLEMENTS Serilizable and Clonable Interfaces but not Random Access
		 LinkedList ll = new LinkedList<>();
		 ll.add("durga");
		 ll.add(30);
		 ll.add(null);
		 ll.add("durga");
		 System.out.println(ll);
		 ll.set(2, "raj");
		 System.out.println(ll);
		 ll.add(0,"venky");
		 System.out.println(ll);
		 ll.removeLast();
		 System.out.println(ll);
		 ll.addFirst("CCC");
		 System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		
		

	}

}
