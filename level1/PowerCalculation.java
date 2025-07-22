
import java.util.Scanner;

public class PowerCalculation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter base = ");
        int a= sc.nextInt();
        System.out.print("enter exponent = ");
        int b=sc.nextInt();
        double c=Math.pow(a, b);
        System.out.println(a+"raised to the power "+b+" is = "+c);
    }
}
