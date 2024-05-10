package collectiondemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(20);
		v.add(65);
		v.add(2);
		
		//find maximum element by using predefined method
         Integer n = Collections.max(v);	
         System.out.println(n);
       //find maximum element by iterator
         int maxvalue= Integer.MIN_VALUE;
         
         Iterator it=v.iterator();
         
         while (it.hasNext()) {
		  
        	 
        	 int element=(int) it.next();
        	 
			if (element>maxvalue) {
				maxvalue=element;
			}
		}
         System.out.println(maxvalue);
     	//sort element by using Collections method
         Collections.sort(v);
         System.out.println(v);
         // Searching an element using binarySearch() method
         // of Collections class
         int index = Collections.binarySearch(v, 2);
  
         // Printing the position of the target
         System.out.println("Element is found at index : "+ index);
	}
	

	

}
