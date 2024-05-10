package hackerrankpractice.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CheckPrimeNumber {
	
	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String n = bufferedReader.readLine();
	      
	        bufferedReader.close();
	        
	             BigInteger num = new BigInteger(n);
	     

	        System.out.println(num.isProbablePrime(1) ? "prime" : "not prime");

	}

}
