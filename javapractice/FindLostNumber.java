package javapractice;

import java.util.Scanner;

public class FindLostNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s="5 7 4 3 2 6";
		LostCount(s);
	}
	
	public static void LostCount(String s) {
		int count = s.split(" ").length-1;
		  // if the value count is present then print count
        // else print -1
		if (s.indexOf(Integer.toString(count)) != -1)
            System.out.println("Number of elements "
                               + count);
        else
            System.out.println(-1);
	}

}
