package level2;

import java.util.Scanner;

public class ScoreCard {
    static int[][] genScores(int n) {
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = 50 + (int)(Math.random() * 50);
        return a;
    }

    static double[][] calcStats(int[][] a) {
        int n = a.length;
        double[][] b = new double[n][3];
        for (int i = 0; i < n; i++) {
            int t = a[i][0] + a[i][1] + a[i][2];
            double avg = t / 3.0, perc = t / 3.0;
            b[i][0] = t;
            b[i][1] = Math.round(avg * 100.0) / 100.0;
            b[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return b;
    }

    static String[] calcGrades(double[][] b) {
        int n = b.length;
        String[] g = new String[n];
        for (int i = 0; i < n; i++) {
            double p = b[i][2];
            g[i] = p >= 90 ? "A+" : p >= 80 ? "A" : p >= 70 ? "B+" : p >= 60 ? "B" : p >= 50 ? "C" : "F";
        }
        return g;
    }

    static void display(int[][] a, double[][] b, String[] g) {
        System.out.println("Phy Chem Math Total Avg%  Perc% Grade");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "   " + a[i][1] + "   " + a[i][2] + "   " +
                (int)b[i][0] + "   " + b[i][1] + "   " + b[i][2] + "   " + g[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = genScores(n);
        double[][] stats = calcStats(scores);
        String[] grades = calcGrades(stats);
        display(scores, stats, grades);
    }
}
