package ATB_7X_JULY_07_2024;

import java.util.Scanner;

public class LeapYearCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year=	sc.nextInt();
		boolean isLeapYear=false;
		if ((year%4==0&&year%100!=0)||(year%400==0)) {
			isLeapYear=true;
		}
		if (isLeapYear) {
			System.out.println(year +"is a leap year");
		} else {
			System.out.println(year+"is not a leap yaer");
		}

	}

}
