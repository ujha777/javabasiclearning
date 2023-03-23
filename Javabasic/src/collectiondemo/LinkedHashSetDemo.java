package collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//best choice to develop cashe based application
		//Child class of HashSet
		//Hashtable+LinkedList=LinkedHashSet
		//Insertion order preserved
		LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
		lhs.add(5);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(null);
		System.out.println(lhs.add(2));//duplicates are not allowed and add method return false
		System.out.println(lhs);

	}

}
