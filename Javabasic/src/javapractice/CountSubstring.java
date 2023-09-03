package javapractice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class CountSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="AABCCAAADCBBAADBBC";
		String str="AA";
		int count = CountMatches(text, str);
		System.out.println("by using indexof method "+count);
		int count1 = useSplitMethods(text, str);
		System.out.println("by using split method "+count1);
		int count3=bysuingPatternMatching(text, str);
		System.out.println("By using Pattern Matching "+count3);
		
	}
	 /* Checks if a string is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
	public static int CountMatches(String text, String str) {
		if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }
 
        return count;
	}

    /* Counts how many times the substring appears in the larger string. */
    public static int useSplitMethods(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        return text.split(str, -1).length - 1;
    }
    /* Counts how many times the substring appears in the larger string. */
    public static int bysuingPatternMatching(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        Matcher matcher = Pattern.compile(str).matcher(text);
 
        int count = 0;
        while (matcher.find()) {
            count++;
        }
 
        return count;
    }
 
}
