
public class ReverseJunkSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Gang@#$789%$#";
		//By using special character we can remove special and junk char
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
