package collectiondemo;

import java.util.HashSet;

public class HashSetDemo {

		//	In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.

		//  The hashcode of an element is a unique identity that helps to identify the element in a hash table.

		//	HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hashcode.
	//Underlying data structure is Hashtable
	//duplicates are not allowed
	//Insetrtion order not preserved ,all objects  will added based on hashcode(search operation will be easy)
	//hetreogeneous allowed
	//null insertion are allowed
	//Implements Serializable and Cloneable
	//best choice when we are doing search operation
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set1 = new HashSet<>();
		set1.add(5);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(null);
		System.out.println(set1.add(2));//duplicates are not allowed and add method return false
		System.out.println(set1);



		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("HashSet: " + numbers);

		// Using remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);

		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value2);



	}

}
