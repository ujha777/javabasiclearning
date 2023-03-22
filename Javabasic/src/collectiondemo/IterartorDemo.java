package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IterartorDemo {
	//By using Iterator we can get only read access and remove operation  but we cannot perform replacement and addition of new object
	//both enumeraton and iterator are single direction cursor only
	//we can move only forward direction not backward
	//to overcome the limitation listiterator introduced
	
	//To overcome we can use Iterator	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<=10;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Integer values = (Integer)it.next();
			if (values%2==0) {
				System.out.println(values);
			}
				else {
				it.remove();
			}
			
		}
		
	}

}
