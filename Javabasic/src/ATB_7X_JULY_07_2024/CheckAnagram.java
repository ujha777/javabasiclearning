package ATB_7X_JULY_07_2024;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="silent";
		String str2="listen";
        
		if (areAnagaran(str1, str2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not anagrams");
		}

	}

	public static boolean areAnagaran(String str1,String str2) {
		str1=str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		str2=str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

		if (str1.length()!=str2.length()) {
			return false;
		}
		char[] s1 = str1.toCharArray();
		Arrays.sort(s1);
		char[] s2 = str2.toCharArray();
		Arrays.sort(s2);
        
		for (int i = 0; i < s1.length; i++) {
			if (s1[i]!=s2[i]) {
				return false;
			}
		}
		
		return true;

	}

}
