import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int a = sc.nextInt();
        while (a >= 1) {
            System.out.println(a);
            a--;
        }
        System.out.println("Liftoff!");
    }
}
