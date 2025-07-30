package level__1;
import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("num1 is = ");
        int num1=sc.nextInt();
        System.out.print("num2 is = ");
        int num2=sc.nextInt();
        System.out.print("num3 is = ");
        int num3=sc.nextInt();
        boolean isSmallest = (num1 < num2) && (num1 < num3);
        System.out.println("Is the first number the smallest? " + isSmallest);


    }
}
