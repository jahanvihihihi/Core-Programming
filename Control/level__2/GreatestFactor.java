package level__2;

import java.util.Scanner;

public class GreatestFactor {
    public static void findGreatestFactor(int number) {
        if (number <= 1) {
            System.out.println("No proper factor exists for this number.");
            return;
        }

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; 
            }
        }

        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        findGreatestFactor(number);
    }
}
