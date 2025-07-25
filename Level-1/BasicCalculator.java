import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = input.nextDouble();

        System.out.print("Enter second number: ");
        b = input.nextDouble();

        double sum = a + b;
        double diff = a - b;
        double mul = a * b;
        double div = a /b;

        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f", 
                          a, b, sum, diff, mul, div);
    }
}
