import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Reversing Integer");
      int num, rem, result=0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter num");
     num= in.nextInt();
     while(num>0) {
    	 
    	 rem=num%10;
    	 result=result*10+rem;
    	 num=num/10;
    	 
     }
     System.out.println(result);
     
     //by using string buffer
     int num1=543;
     String str= String.valueOf(num1);
     StringBuffer sb= new StringBuffer(str);
     System.out.println(sb.reverse());
     
     in.close();
     
      
	}

}
