package javapractice;

public class CountNoOfDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GeeksForGeeks12334";
		int digit=0;
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isDigit(str.charAt(i))) {
				digit++;
			}
		}
		System.out.println(digit);
	}

}
