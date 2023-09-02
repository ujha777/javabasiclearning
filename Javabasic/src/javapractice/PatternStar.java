package javapractice;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("case1");
		//Rows
        for(int i=1;i<=n;i++) {
        	//Columns
        	for(int j=1;j<=n;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("case2:Increasing Triangle of star");
        for(int i=1;i<=n;i++) {
        	//Columns
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("case3:Decreasing Triangle of star");
        for(int i=1;i<=n;i++) {
        	//Columns
        	for(int j=i;j<=n;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("case4:Increasing Triangle of Space and Decreasing Triangle of star");
        for(int i=1;i<=n;i++) {
        	//Columns
        	//Increasing Triangle of Space
        	for(int j=1;j<=i;j++) {
        		System.out.print(" ");
        	}
        	//Decreasing Triangle of star
        	for(int k=i;k<=n;k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("case5:Increasing Triangle of STAR and Decreasing Triangle of SPACE");
        for(int i=1;i<=n;i++) {
        	//Columns
        	//Increasing Triangle of Space
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	//Decreasing Triangle of star
        	for(int k=i;k<=n;k++) {
        		System.out.print(" ");
        	}
        	System.out.println();
        }
        System.out.println("case6:Decreasing Triangle of space and increasing Triangle of star");
        for(int i=1;i<=n;i++) {
        	//Columns
        
        	//Decreasing Triangle of space
        	for(int k=i;k<=n;k++) {
        		System.out.print(" ");
        	}
        	//Increasing Triangle of star
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("case7:Decreasing Triangle of space and increasing Triangle of star 2 times");
        for(int i=1;i<=n;i++) {
        	//Columns
        
        	//Decreasing Triangle of space
        	for(int k=i;k<=n;k++) {
        		System.out.print(" ");
        	}
        	//Increasing Triangle of star where j<1 
        	for(int j=1;j<i;j++) {
        		System.out.print("*");
        	}
        	//Increasing Triangle of star
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        System.out.println("case8:increasing Triangle of space and decreasing Triangle of star 2 times");
        for(int i=1;i<=n;i++) {
        	//Columns
        
        	//increasing Triangle of space
        	for(int k=1;k<=i;k++) {
        		System.out.print(" ");
        	}
        	//decreasing Triangle of star where j<n
        	for(int j=i;j<n;j++) {
        		System.out.print("*");
        	}
        	//decreasing Triangle of star
        	for(int j=i;j<=n;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
