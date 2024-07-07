package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class TraingleClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		int side2=sc.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		int side3=sc.nextInt();
		
		if (side1==side2 && side2==side3 && side3==side1) {
			System.out.println("Equilateral Traingle");
		}else if (side1==side2||side2==side3||side3==side1) {
		     System.out.println("Isosceles Traingle");	
		} else {
			System.out.println("Scalene Traingle");
		}

	}

}
