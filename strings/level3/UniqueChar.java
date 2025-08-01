package level3;

import java.util.Scanner;

public class UniqueChar {
    static int strLen(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    static char[] findUnique(String s) {
        int n = strLen(s), idx = 0;
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) res[idx++] = ch;
        }
        char[] finalRes = new char[idx];
        for (int i = 0; i < idx; i++) finalRes[i] = res[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] u = findUnique(s);
        for (char c : u) System.out.print(c + " ");
    }
}
