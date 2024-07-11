package ATB_7X_JULY_07_2024;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression_CharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		Pattern p=Pattern.compile("ab");
		Matcher m = p.matcher(str);
		
		while (m.find()) {
			System.out.println(m.start()+"---->"+m.end()+"---->"+m.group());
		}
		
		

	}

}
