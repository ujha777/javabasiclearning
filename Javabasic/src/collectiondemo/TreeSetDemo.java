package collectiondemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
//Underlying data structure is balanced tree
	//duplicates are not allowed
	//insertion order are not preserved
	//objected added based on sorting order
	//heterogeneous are not allowed..try to add it will throw RE
	//null acceptance allowed only once
	//For Empty Tree Set as the 1st element null Insertion is possible
	//but after inserting null, if we try to insert any other element we will get Null Pointer Exception
	//For Non empty Tree Set, if we try to insert NULL we will get NPE
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Set<Integer> numbers = new TreeSet<>();

	        // Add elements to the set
	        //numbers.add(null);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(1);
	       // numbers.add(null);-->NPE
	        System.out.println("Set using TreeSet: " + numbers);
	        
	       Iterator<Integer> it = numbers.iterator();
	       while (it.hasNext()) {
			Integer values = it.next();
			System.out.println(values);
		}

	}

}
