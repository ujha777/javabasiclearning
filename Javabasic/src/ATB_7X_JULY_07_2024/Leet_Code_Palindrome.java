package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class Leet_Code_Palindrome {
	//Input =121

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=rec_fn(n, 0);
		if (n == rev)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");

	
}
static int rec_fn(int n, int rev) {
	if (n < 10) {
		return rev * 10 + n;
	} else {
		int digit = n % 10;
		rev = rev * 10 + digit;


	}
	return rec_fn(n/10, rev);

}
}
