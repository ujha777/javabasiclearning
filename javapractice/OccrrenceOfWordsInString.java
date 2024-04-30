package javapractice;

import java.util.HashMap;
import java.util.Map;

public class OccrrenceOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Declaring the String
        String str = "Alice is girl and Bob is boy";
		 Map<String, Integer> hashMap = new HashMap<>();
		 
	        // Splitting the words of string
	        // and storing them in the array.
	        String[] words = str.split(" ");
	 
	        for (String word : words) {
	 
	            // Asking whether the HashMap contains the
	            // key or not. Will return null if not.
	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                // Storing the word as key and its
	                // occurrence as value in the HashMap.
	                hashMap.put(word, 1);
	 
	            else {
	                // Incrementing the value if the word
	                // is already present in the HashMap.
	                hashMap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hashMap);

	}

}
