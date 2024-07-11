package ATB_7X_JULY_07_2024;

public class LeetCode_ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =12345;
		int rev=0;
		
		while (n>0) {
		    int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println(rev);
	}

}
