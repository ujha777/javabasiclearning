package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserDefinedHashMap {
	String fname;
	String lname;
	
	public UserDefinedHashMap(String f, String l) {
		// TODO Auto-generated constructor stub
		fname=f;
		lname=l;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName "+ fname + " LastName "+ lname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //Approach 2-Hashmap
        
//      
//      Create a hash map with user-defined key and value pair and fill the hash map using put() method.
//      Make sure to Override the toString() method in the user-defined class to print the items in the desired format.
//      Iterate over the hash map using the EntrySet() for loop and print the elements.
      UserDefinedHashMap ob1 = new UserDefinedHashMap("Ajay", "Mishra");
      UserDefinedHashMap ob2 = new UserDefinedHashMap("Viay", "Kohli");
      UserDefinedHashMap ob3 = new UserDefinedHashMap("Raj", "Dhoni");
      UserDefinedHashMap ob4 = new UserDefinedHashMap("Alok", "Sharma");
      
      HashMap<Integer,UserDefinedHashMap> hm = new HashMap<Integer, UserDefinedHashMap>();
      hm.put(101,ob1);
      hm.put(102, ob2);
      hm.put(103, ob3);
      hm.put(104, ob4);
      
      for (Map.Entry entry : hm.entrySet()) {
    	  System.out.println(entry.getKey() + " "
                  + entry.getValue().toString());
		
	}
      
	}

}
