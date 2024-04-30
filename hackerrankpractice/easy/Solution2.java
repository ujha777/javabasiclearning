package hackerrankpractice.easy;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
		String Upper1 = A.substring(0,1);
		Upper1=Upper1.toUpperCase();
		String Remain1 = A.substring(1, A.length());
		String Final1=Upper1+Remain1;
		
		String Upper2 =B.substring(0,1);
		Upper2=Upper2.toUpperCase();
		String Remain2 =B.substring(1, B.length());
		String Final2=Upper2+Remain2;
		System.out.println(Final1+ " "+Final2);

		
        
	}

}
