package level_2;

import java.util.Scanner;

public class LeapYearCheck {
    public static boolean isLeapYear(int year) {
        return (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println("The year is a Leap Year");
        else
            System.out.println("The year is not a Leap Year");
    }
}
