
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Selenium";
		String rev="";
		int size=str.length();
		
		for(int i=size-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);	

	}

}
