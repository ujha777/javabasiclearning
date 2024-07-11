package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		// String str= Geeks for Geeks
		String str = sc.nextLine();
		
		String output = removeDuplicates(str);
		System.out.println(output);
		


	}
	
	public static String removeDuplicates(String str) {
		String result="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (result.indexOf(ch)==-1) {
				result=result+ch;
			}
		}
		
		return result;
		
	}
	
	

}
