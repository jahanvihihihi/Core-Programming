
import java.util.Scanner;

public class CelciusToFahrenhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temp in cel = ");
        int a=sc.nextInt();

        int b=(a*9/5)+32;
        System.out.print("the temp in farh is = "+b);
    }
}
