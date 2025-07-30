import java.util.Scanner;

public class FriendsAgeHeight {

    public static String findYoungest(int age1, int age2, int age3) {
        if (age1 <= age2 && age1 <= age3) {
            return "Amar";
        } else if (age2 <= age1 && age2 <= age3) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static String findTallest(double h1, double h2, double h3) {
        if (h1 >= h2 && h1 >= h3) {
            return "Amar";
        } else if (h2 >= h1 && h2 >= h3) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        String youngest = findYoungest(ageAmar, ageAkbar, ageAnthony);
        String tallest = findTallest(heightAmar, heightAkbar, heightAnthony);

        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
