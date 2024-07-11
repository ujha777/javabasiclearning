package ATB_7X_JULY_07_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidEmailRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email="plainaddress";
		String gmailRegex="[a-zA-Z0-9][a-zA-Z0-9]*";
		
		Pattern p=Pattern.compile(gmailRegex);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			System.out.println("Missing @ and domain");
		}
		
		String email1="@invalid.com";
		String gmailRegex1="@[a-zA-Z0-9]+[.]([a-zA-Z0-9]+)+";
		
		Pattern p1=Pattern.compile(gmailRegex1);
		Matcher m1 = p1.matcher(email1);
		if (m1.matches()) {
			System.out.println("Missing username");
		}
		
		
		
		
	}

}
