package collectiondemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
//by using list iterator we can move either to forward direction or backward direction
//while iterating by listIterator we can perform replacement and addition of new objects in order to read and remove operation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<>();
		ll.add("abc");
		ll.add("xyz");
		ll.add("pqr");
		System.out.println(ll);
		ListIterator<String> itr= ll.listIterator();
		while (itr.hasNext()) {
		String str = (String)itr.next();
		if (str.equals("xyz")) {
			itr.remove();
			System.out.println(str);
		}
		
			
		}
	}

}
