package javapractice;

import java.util.regex.Pattern;

public class StringToStringArrayUsingRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Geeks for Geeks";
		String my_pattern="\\s";
		Pattern pattern=Pattern.compile(my_pattern);
		String[] string_array = pattern.split(str);
		System.out.print("\nstring array:[");
		for (int i = 0; i < string_array.length; i++) {
			System.out.print(string_array[i]+" ");
			
		}
		System.out.print("]");


	}

}
