package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter a number");
      Scanner sc=new Scanner(System.in);
      int num = sc.nextInt();
      if (num>=90 && num <=100) {
		System.out.println("A");
	}else if (num>=80 && num <=89) {
		System.out.println("B");
	}
	else if (num>=70 && num <=79) {
		System.out.println("C");
	}
	else if (num>=60 && num <=69) {
		System.out.println("D");
	} else if (num>=0 && num <=59) {
		System.out.println("E");
	}
	}

}
