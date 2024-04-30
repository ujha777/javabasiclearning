package hackerrankpractice.easy;

import java.util.Scanner;

public class Solution1 {
//	Input Format
//	There are two lines of input. 
//  The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
//	Constraints
//	Output Format
//	If both values are greater than zero, then the main method must output the area of the parallelogram. 
//Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
    static int B,H;
    static boolean flag=true;
    static{
        Scanner sc=new Scanner(System.in);
       B= sc.nextInt();
       H= sc.nextInt();
       if(B>0 && H>0){
           flag=true;
           
       }
       else if(B<=0||H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag=false;
                
            }
             
    
}


	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//e

}
