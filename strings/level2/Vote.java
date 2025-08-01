package level2;

import java.util.Scanner;

public class Vote {
    static int[] getAges(int n) {
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        return a;
    }

    static String[][] canVote(int[] a) {
        String[][] res = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            res[i][0] = String.valueOf(a[i]);
            res[i][1] = a[i] >= 18 ? "true" : "false";
            if (a[i] < 0) res[i][1] = "false";
        }
        return res;
    }

    static void display(String[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + " " + a[i][1]);
    }

    public static void main(String[] args) {
        int[] ages = getAges(10);
        String[][] result = canVote(ages);
        display(result);
    }
}
