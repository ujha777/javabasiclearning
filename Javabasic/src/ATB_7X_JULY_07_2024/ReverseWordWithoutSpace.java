package ATB_7X_JULY_07_2024;

public class ReverseWordWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="RohitSharma";
			String reversed=new StringBuilder(str).reverse().toString();
			if (str.equals(reversed)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
				System.out.println(reversed);
			}
	}

}
