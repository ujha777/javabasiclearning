package hackerrankpractice.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {
	
	static String regularExpression="^[A-Za-z]\\w{7,29}$";
	 Pattern p = Pattern.compile(regularExpression);
	 Matcher m =p.matcher(regularExpression);
	 
}
