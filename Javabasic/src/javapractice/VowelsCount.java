package javapractice;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="GangeshGunjanJha";
		str=str.toLowerCase();
		CountVowles(str);

	}
		
	
	public static void CountVowles(String str) {
	int count=0;

	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
	     count++;
	     
	}

		}

	  System.out.println("Total Vowels count "+count);
	}

}
