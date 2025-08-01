package level3;

import java.util.Scanner;

public class BMIcalc {
    static double bmiCalc(double w, double h) {
        h = h / 100.0;
        return Math.round((w / (h * h)) * 100.0) / 100.0;
    }

    static String status(double bmi) {
        return bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese";
    }

    static String[][] bmiStatus(double[][] a) {
        int n = a.length;
        String[][] res = new String[n][4];
        for (int i = 0; i < n; i++) {
            double w = a[i][0], h = a[i][1];
            double bmi = bmiCalc(w, h);
            res[i][0] = String.valueOf(h);
            res[i][1] = String.valueOf(w);
            res[i][2] = String.valueOf(bmi);
            res[i][3] = status(bmi);
        }
        return res;
    }

    static void display(String[][] a) {
        System.out.println("Height(cm) Weight(kg) BMI    Status");
        for (String[] r : a)
            System.out.println(r[0] + "        " + r[1] + "        " + r[2] + "  " + r[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        String[][] res = bmiStatus(data);
        display(res);
    }
}
