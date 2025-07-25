public class CourseFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount is INR " + discount + " and the discounted price to pay is INR " + finalFee);
    }
}
