package hackerrankpractice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {

	 static boolean isAnagram(String a, String b) {
		 if (a.length()!=b.length()) {
	            System.out.println("Not Anagrams");
	        }
	         else if(a.length()==b.length()) {
	            a= a.toLowerCase();
	            b= b.toLowerCase();
	            char[] arr1 = a.toCharArray();
	            char[] arr2 = b.toCharArray();
	            
	            java.util.Arrays.sort(arr1);
	            java.util.Arrays.sort(arr2);
	            return java.util.Arrays.equals(arr1, arr2);
	            
	         }
	        return false;
		
		
			
		
		
	        // Complete the function
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }

}
