package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an arraylist dynamically
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("c");
		list.add("u");
		
		 String[] arr = list.toArray(new String[0]);

	        // Iterating over elements of array
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
