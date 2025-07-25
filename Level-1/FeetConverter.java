import java.util.Scanner;

public class FeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance is %.2f feet, which is %.2f yards and %.5f miles.", distanceInFeet, distanceInYards, distanceInMiles);
    }
}
