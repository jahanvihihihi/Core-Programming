import java.util.Scanner;

public class FeewithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee =sc.nextInt();
        int discountPercent=sc.nextInt();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount is INR " + discount + " and the discounted price to pay is INR " + finalFee);
    }
}
