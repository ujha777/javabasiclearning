package hackerrankpractice.easy;

import java.util.Scanner;

public class Solution19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		for (int num : arr) {
			System.out.println(num);
		}

	}

}
