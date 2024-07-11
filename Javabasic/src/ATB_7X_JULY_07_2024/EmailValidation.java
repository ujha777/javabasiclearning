package ATB_7X_JULY_07_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String email="jhagangeshgunjan@gmail.com";
			
			String emailRegex="[a-zA-Z0-9][Aa-zA-Z0-9_.]*@[Aa-zA-Z0-9]+[.]([a-zA-Z]+)+";
			
			Pattern p=Pattern.compile(emailRegex);
			Matcher m = p.matcher(email);
			if (m.matches()) {
				System.out.println("Valid email id");
			}else {
				System.out.println("Not a Valid email");
			}
	}

}
