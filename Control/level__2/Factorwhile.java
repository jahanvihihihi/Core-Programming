package level__2;

import java.util.Scanner;

public class Factorwhile {
    public static void printFactors(int number) {
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Factors of " + number + " (excluding itself) are:");
        int i = 1; 

        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        printFactors(number);
    }
}
