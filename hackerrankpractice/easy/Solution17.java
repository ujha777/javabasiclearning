package hackerrankpractice.easy;

import java.util.Scanner;

public class Solution17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
	}

}
