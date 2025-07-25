public class Profit {
    public static void main(String[] args) {
        double cp=129;
        double sp=191;
        double profit=sp-cp;
        double pp=(profit/cp)*100;
        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f\nThe Profit is INR %.2f and the Profit Percentage is %.2f%%", cp, sp, profit, pp);
    }
}
