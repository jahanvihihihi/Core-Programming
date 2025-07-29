package level_2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3];  // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + " (out of 100): ");
                    marks[i][j] = sc.nextDouble();
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            // Assign grade
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 80) grade[i] = "B";
            else if (percentage[i] >= 70) grade[i] = "C";
            else if (percentage[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }

        // Display result
        System.out.println("\nStudent\tPhysics\tChem\tMaths\t% \tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.2f\t%s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }
    }
}
