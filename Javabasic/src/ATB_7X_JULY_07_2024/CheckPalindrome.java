package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc= new Scanner(System.in);
		String originalString = sc.nextLine();
		int count =originalString.length();
		String reversreString="";
	    
		for (int i = count-1;i>=0; i--) {
			reversreString=reversreString+originalString.charAt(i);
			
		}
		if (originalString.equalsIgnoreCase(reversreString)) {
			System.out.println("is Palindrome");
			
		}
		else {
			System.out.println("is not a palindrome");
		}
		

	}

}
