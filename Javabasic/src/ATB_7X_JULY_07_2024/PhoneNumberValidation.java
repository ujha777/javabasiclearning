package ATB_7X_JULY_07_2024;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ph_number=sc.nextLine();
		String phnregex="(0|91)?[7-9][0-9]{9}";
		
		Pattern p= Pattern.compile(phnregex);
		Matcher m=p.matcher(ph_number);
		
		if (m.matches()) {
			System.out.println("Valid Phone number");
		}else {
			System.out.println("Not a Valid Phone Number");
		}
		
		

	}

}
