package hackerrankpractice.easy;

import java.util.Scanner;

public class Solution4 {

	 public static String getSmallestAndLargest(String s, int k) {
		 	String currStr = s.substring(0, k);
	        String smallest = currStr;
	        String largest = currStr;
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        for (int i = k; i < s.length(); i++) {
				currStr=currStr.substring(1, k)+s.charAt(i);
				 if (largest.compareTo(currStr) < 0)     
					 largest = currStr;
	            if (smallest.compareTo(currStr) > 0)
	            	smallest = currStr;    
			}
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
