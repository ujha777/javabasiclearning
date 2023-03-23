package collectiondemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child Interface of Set
		//best choice when we want group of objects in sorting order and duplicates are not allowed
		
		//Sorted set specific methods
		//In order to use the functionalities of the SortedSet interface, 
		//we need to use the TreeSet class that implements it.
		SortedSet<Integer> set=new TreeSet<Integer>();
		set.add(100);
		set.add(102);
		set.add(101);
		set.add(103);
		set.add(104);
		set.add(107);
		set.add(110);
		set.add(115);
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(104));
		System.out.println(set.tailSet(104));
		System.out.println(set.subSet(104, 110));
		System.out.println(set.comparator());
	}

}
