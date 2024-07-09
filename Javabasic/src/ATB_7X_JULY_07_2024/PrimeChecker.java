package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
	   if (isPrimeNumber(number)) {
		System.out.println(number +" is a prime number");
	}else {
		System.out.println(number +" is not a prime number");
	}
	    
	}
	
	public static boolean isPrimeNumber(int number) {
		if (number<=1) {
			return false;
		}
		if (number<=3) {
			return true;
		}
		if (number%2==0||number%3==0) {
			return false;
		}
		
	    for (int i = 5; i <=Math.sqrt(number); i=i+6) {
			if (number%i==0||number%(i+2)==0) {
				return false;
			}
		}
		
		return 	true;
		
	}

}
