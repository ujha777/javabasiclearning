package ATB_7X_JULY_07_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="geeks for geeks";
		String regex="\\s";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()) {
		str=	str.replaceAll(regex, "_");
		}
		System.out.println(str);

	}

}
