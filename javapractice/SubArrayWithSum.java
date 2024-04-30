package javapractice;

import java.util.Scanner;

public class SubArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,7,9};
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		int sum = sc1.nextInt();
		subarray(arr, n, sum);
		
	}
	
	public static void subarray(int[] arr,int n, int sum) {
		for (int i = 0; i < n; i++) {
		 int CurrentSum=arr[i];
		 if (CurrentSum==sum) {
			System.out.println("Sum found at index "+i);
			return;
		 }
		 else {
			 for (int j = i+1; j < n; j++) {
				CurrentSum+=arr[j];
				if (CurrentSum==sum) {
					System.out.println("Sum found between index i and j "+i+" "+j);
					return;
				}
			}
		 }
		 
		}
		System.out.println("No Sub array found");
		return;
	}

}
