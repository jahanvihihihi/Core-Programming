package level__2;

import java.util.Scanner;

public class PowerCalc {
    public static int calculatePower(int number, int power) {
        if (power < 0) {
            System.out.println("This program only supports non-negative powers.");
            return -1;
        }

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        if (number <= 0 || power < 0) {
            System.out.println("Invalid input. Please enter a positive base and a non-negative power.");
        } else {
            
            int result = calculatePower(number, power);
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
}
