package collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintCollectionInJava {
	String name;
	int roll;
	 public PrintCollectionInJava(String s, int n) {
		// TODO Auto-generated constructor stub
		 name=s;
		 roll=n;
		 
	}
	 

	  // over-riding the toString method
	    // to print the collection
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" "+"Roll Number: "+roll;
	}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Approach 1- ArrayList
//		Create an ArrayList of the user-defined objects and populate the ArrayList.
//		Overrider the toString() method in the user-defined class to print the item of the ArrayList in the desired format.
//		Run a for-loop to print the objects.
		  // creating an arraylist of user-defined collection
        ArrayList<PrintCollectionInJava> arr = new ArrayList<PrintCollectionInJava>();
        // creating objects of class PrintCollectionInJava
        PrintCollectionInJava ob1= new PrintCollectionInJava("Ajay", 101);
        PrintCollectionInJava ob2= new PrintCollectionInJava("Vijay", 102);
        PrintCollectionInJava ob3= new PrintCollectionInJava("Sanjay", 103);
        PrintCollectionInJava ob4= new PrintCollectionInJava("Ranvijay", 104);
        
        arr.add(ob1);
        arr.add(ob2);
        arr.add(ob3);
        arr.add(ob4);
        
        for (PrintCollectionInJava printCollectionInJava : arr) {
        	  System.out.println(printCollectionInJava);
		}
      
	
		 
	   

      
        
	}

}
