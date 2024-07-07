package ATB_7X_JULY_07_2024;



public class FizzBizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  for (int i = 1; i <=100; i++) {
		  if (i%3==0 && i%5==0) {
			  System.out.println("FizzBizz");
		}
		  else if (i%3==0) {
			  System.out.println("FIZZ");
		  }
		  else if(i%5==0) {
			  System.out.println("Bizz");
		  }
		  else {
			  System.out.println(i);
		  }
		
	}

	}

}
