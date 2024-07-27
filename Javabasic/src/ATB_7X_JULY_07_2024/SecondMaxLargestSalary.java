package ATB_7X_JULY_07_2024;

public class SecondMaxLargestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sal[]= {35,56,3,22,44,66,84,2,34};
		int n=sal.length;
		
		if(n<2) {
			System.out.println("Invalid input");
			
		}
		
		int second,i;
		int largest =second=Integer.MIN_VALUE;
		for (i = 0; i < sal.length; i++) {
			largest=Math.max(largest, sal[i]);
		}
		System.out.println("Fisrt maximum salary--->"+largest);
		for ( i = 0; i < sal.length; i++) {
			if (sal[i]!=largest) {
			   second=Math.max(second, sal[i]);	
			}
		}
		
		if (second==Integer.MIN_VALUE) {
			System.out.println("No second largest salary");
		}else {
			System.out.println("Second maximum salary--->"+second);
		}

	}

}
