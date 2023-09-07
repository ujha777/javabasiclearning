package javapractice;

import java.util.ArrayList;

public class ConvertArrayListtoCommaSeparatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Gangesh");
		al.add("Gunjan");
		al.add("Jha");
		
		
		String str = String.join(",", al);
		System.out.println(str);

	}

}
