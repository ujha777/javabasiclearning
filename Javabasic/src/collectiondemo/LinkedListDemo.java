package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(20);
		ll.add(89);
		ll.add(6);
		ll.add(73);
		
		for (int i = 0; i < ll.size(); i++) {
			Integer n = ll.get(i);
			
			System.out.println(n);
		}
		
		ll.clear();
		 // Accessing the List after clearing it 
        System.out.println("List after clearing all elements: " + ll); 
    	ll.add(20);
		ll.add(89);
		ll.add(6);
		ll.add(73);
		//Use iterator method
		Iterator<Integer> it= ll.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		ListIterator<Integer> listiterator= ll.listIterator();
		while (listiterator.hasNext()) {
			Integer integer = (Integer) listiterator.next();
			System.out.println(integer);
			
		}
		
		while (listiterator.hasPrevious()) {
			Integer integer = (Integer) listiterator.previous();
			System.out.println(integer);
			
		}
	
	}

}
