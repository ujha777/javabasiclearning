package ATB_7X_JULY_07_2024;

public class Traingle_Start_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("Left Star Pattern");
		for (int i = n; i>=1 ; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("Pyramid Pattern");
		for (int i = 1; i <=n; i++) {
			//Print space before the stars
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			//Print Stars
			for (int k = 1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}

	}

}
