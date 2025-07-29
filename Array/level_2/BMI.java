package level_2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height); 
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.1f\t%.2f\t%.2f\t%s\n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }
    }
}
