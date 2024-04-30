package javapractice;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str=" I like Coding ";
      String newstr = str.replaceAll("\\s","" );
      System.out.println(newstr);
	}
	


}
