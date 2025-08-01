package level3;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        String[][] res = new String[s.length()][2];
        int k = 0;
        boolean[] added = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!added[c]) {
                res[k][0] = String.valueOf(c);
                res[k][1] = String.valueOf(freq[c]);
                added[c] = true;
                k++;
            }
        }
        return Arrays.copyOf(res, k);
    }

    static void display(String[][] arr) {
        System.out.println("Char  Freq");
        for (String[] row : arr) System.out.println("  " + row[0] + "     " + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] result = findFrequency(s);
        display(result);
    }
}
