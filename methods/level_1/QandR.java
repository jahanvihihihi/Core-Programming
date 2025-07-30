import java.util.Scanner;

public class QandR {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        } else {
            System.out.println("Divisor cannot be zero.");
        }
    }
}
