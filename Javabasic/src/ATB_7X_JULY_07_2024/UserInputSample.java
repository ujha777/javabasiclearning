package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class UserInputSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the name ");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		
		System.out.print("Enter the age ");
        Scanner sc1 =new Scanner(System.in);
        int age=sc1.nextInt();
        
        System.out.println("Enter the age "+ name + " You are "+ age);
        
        
        
        
	}

}
