import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int a = sc.nextInt();
        System.out.print("num2: ");
        int b = sc.nextInt();
        System.out.print("num3: ");
        int c = sc.nextInt();
        
        boolean firstLargest = (a > b) && (a > c);
        boolean secondLargest = (b > a) && (b > c);
        boolean thirdLargest = (c > a) && (c> b);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}
