package javapractice;

import java.util.Objects;

public class CompareTwoStingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Using user-defined function
		    String string1 = new String("Geeksforgeeks");
	        String string2 = new String("Practice");
	        String string3 = new String("Geeks");
	        String string4 = new String("Geeks");
	        String string5 = new String("geeks");
	        
	        // Comparing for String 1 < String 2
	        System.out.println("Comparing " + string1 + " and " + string2
	                           + " : " + stringCompare(string1, string2));
	  
	        // Comparing for String 3 = String 4
	        System.out.println("Comparing " + string3 + " and " + string4
	                           + " : " + stringCompare(string3, string4));
	  
	        // Comparing for String 1 > String 4
	        System.out.println("Comparing " + string1 + " and " + string4
	                           + " : " + stringCompare(string1, string4));
	        
	        
		//2.Using String.equals()
	  
	        // Comparing for String 1 != String 2
	        System.out.println("Comparing " + string1 + " and " + string2
	                           + " : " + string1.equals(string2));
	  
	        // Comparing for String 3 = String 4
	        System.out.println("Comparing " + string3 + " and " + string4
	                           + " : " + string3.equals(string4));
	  
	        // Comparing for String 4 != String 5
	        System.out.println("Comparing " + string4 + " and " + string5
	                           + " : " + string4.equals(string5));
	  
	        // Comparing for String 1 != String 4
	        System.out.println("Comparing " + string1 + " and " + string4
	                           + " : " + string1.equals(string4));
		//3.Using String.equalsIgnoreCase()
	        // Comparing for String 1 != String 2
	        System.out.println("Comparing " + string1 + " and " + string2
	                           + " : " + string1.equalsIgnoreCase(string2));
	  
	        // Comparing for String 3 = String 4
	        System.out.println("Comparing " + string3 + " and " + string4
	                           + " : " + string3.equalsIgnoreCase(string4));
	  
	        // Comparing for String 4 = String 5
	        System.out.println("Comparing " + string4 + " and " + string5
	                           + " : " + string4.equalsIgnoreCase(string5));
	  
	        // Comparing for String 1 != String 4
	        System.out.println("Comparing " + string1 + " and " + string4
	                           + " : " + string1.equalsIgnoreCase(string4));
		//4.Using Objects.equals()
	        String string6 = new String("Geeksforgeeks");
	        String string7 = new String("Geeks");
	        String string8 = new String("Geeks");
	        String string9 = null;
	        String string10 = null;
	        // Comparing for String 6 != String 7
	        System.out.println("Comparing " + string6 + " and " + string7
	                           + " : " + Objects.equals(string6, string7));
	  
	        // Comparing for String 7 = String 8
	        System.out.println("Comparing " + string7 + " and " + string8
	                           + " : " + Objects.equals(string7, string8));
	  
	        // Comparing for String 6 != String 9
	        System.out.println("Comparing " + string6 + " and " + string9
	                           + " : " + Objects.equals(string6, string9));
	  
	        // Comparing for String 9 = String 10
	        System.out.println("Comparing " + string9 + " and " + string10
	                           + " : " + Objects.equals(string9, string10));
		//Using String.compareTo() 
	        // Comparing for String 1 < String 2
	        System.out.println("Comparing " + string1 + " and " + string2
	                           + " : " + string1.compareTo(string2));
	  
	        // Comparing for String 3 = String 4
	        System.out.println("Comparing " + string3 + " and " + string4
	                           + " : " + string3.compareTo(string4));
	  
	        // Comparing for String 1 > String 4
	        System.out.println("Comparing " + string1 + " and " + string4
	                           + " : " + string1.compareTo(string4));
		String s1="Java";
		String s2="Java";
		System.out.println(s1==s2);//true
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		String s3=new String("Java");
		String s4=new String("Java");
		System.out.println(s3==s4);//false
		System.out.println(s3.equalsIgnoreCase(s4));//true

	}
	
	public static int stringCompare(String str1,String str2) {
		int l1=str1.length();
		int l2=str2.length();
		int lmin=Math.min(l1, l2);
		
		for (int i = 0; i <lmin; i++) {
		int str1_ch = (int)str1.charAt(i);
		int str2_ch = (int)str1.charAt(i);
		
		if(str1_ch!=str2_ch) {
			return str1_ch-str2_ch;
		}
		}
		if (l1!=l2) {
			return l1-l2;
		}
		else
			return 0;
		
		
	
		
	}

}
