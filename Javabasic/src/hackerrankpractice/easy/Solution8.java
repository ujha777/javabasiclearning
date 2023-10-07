package hackerrankpractice.easy;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year = sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		int month=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		int day = sc2.nextInt();
		findDay(month, day, year);
		
	}
	public static String findDay(int month, int day, int year) {
        System.out.println("_________________________ Java Date And Time Days Of Week Finder _________________________________");
        System.out.printf("Given the date -> %d/%d/%d %n", day,month,year);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day); // note: months in Calendar are 0-based (0 = January, 1 = February, ..., 11=December)

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] daysOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        
        System.out.printf("The day of the week is -> %s %n%n%n", daysOfWeek[dayOfWeek]);

        return daysOfWeek[dayOfWeek];
	}
}
