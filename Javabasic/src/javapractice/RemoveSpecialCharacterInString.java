package javapractice;

import java.util.Arrays;

public class RemoveSpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int size=0;
		String s = "He is a very very good boy, isn't he?";
		 String arr1[] = s.split("[ !,?.\\s'@]+");
		 System.out.println(arr1.length);
		 for (int i=0;i<arr1.length;i++) { 
			 
			 if (!arr1[i].isBlank()) {
			      
				 System.out.println(arr1[i]);
			}
			
			
			 }
		 
	

	}

}
