package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class Count_Vowels_Consonants_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		countVowels(str);
		

	}
	
	public static void  countVowels(String str) {
		int countVowels=0;
		int countConsonants=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				countVowels++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				countConsonants++;
			}
		}
		 
		
		System.out.println("TOTALS Vowels count "+countVowels);
	    System.out.println("TOTALS Consonants count "+countConsonants);

		}
	

}
