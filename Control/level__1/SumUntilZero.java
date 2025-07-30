import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double n;
        System.out.print("Enter a number (0 to stop): ");
        n = sc.nextDouble();
        while (n != 0) {
            total += n;
            System.out.print("Enter a number (0 to stop): ");
            n = sc.nextDouble();
        }
        System.out.println("Total sum: " + total);
    }
}
