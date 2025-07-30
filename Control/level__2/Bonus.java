package level__2;

import java.util.Scanner;

public class Bonus {
    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05; 
        } else {
            return 0.0; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = calculateBonus(salary, yearsOfService);

        if (bonus > 0) {
            System.out.println("Bonus amount: ₹" + bonus);
        } else {
            System.out.println("No bonus awarded. Service less than or equal to 5 years.");
        }
    }
}
