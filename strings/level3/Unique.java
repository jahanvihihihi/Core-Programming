package level3;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    static char[] uniqueChars(String s) {
        char[] u = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < k; j++) if (u[j] == c) found = true;
            if (!found) u[k++] = c;
        }
        return Arrays.copyOf(u, k);
    }

    static String[][] findFreqWithUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    static void display(String[][] arr) {
        System.out.println("Char  Freq");
        for (String[] row : arr) System.out.println("  " + row[0] + "     " + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        display(findFreqWithUnique(s));
    }
}
