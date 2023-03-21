package collectiondemo;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	//Underlying datastructure Resizable Array are growable array
	//Duplicates are allowed
	//Insertion order is preserved
	//hetreogeneous objects are allowed(Except In Tree Set and TreeMap not allowed)
	//null insertion is possible
	
	//Constructor
	//AL l = new AL(); default initial capacity is 10
	// new capacity= (current capacity*3/2)+1
	//Create an empty array list object with default initial capacity 10,Once reaches its map capacity 
	// a new array list will be created with new capacity= (cc*3/2)+1
	//AL l = new AL(int initalcapacity);
	
	//AL l = new AL(Collection c);
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
		
		//Best choice of using AL if our frequent operation is retrieval operation
		//Worst choice of using LL if our frequent operation is insertion or deletion in the middle
		//(Because several shift operation is required)
		
		//By default array list is non synchronized
		//but we acheive synchronization version of AL by using Collection class synchronized list method
		
		ArrayList l1= new ArrayList<>();
		List l2= Collections.synchronizedList(l1);
		//Similarly we can get synchronized version of Set,Map Object
		//by using following method
	    //Collections.synchronizedSet(l2);
		//Collections.synchronizedMap(l2);
	    
		
	}
	
	
	
	

}
