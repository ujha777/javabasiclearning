package ATB_7X_JULY_07_2024;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseStringInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		
		Pattern pattern=Pattern.compile("\\s");
		String[] temp=pattern.split(input);
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		String reverse="";
		
		for (int i = 0; i < temp.length; i++) {
			   if (i == temp.length - 1) 
				   reverse = temp[i] + reverse; 
	            else
	            	reverse = " " + temp[i] + reverse; 
			
		}
		System.out.println(reverse);

	}
	
	

}
