import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kilometers =");
        double a= sc.nextInt();
        double b=(a*0.621371);
        System.out.println("miles is "+ b);

    }
}
