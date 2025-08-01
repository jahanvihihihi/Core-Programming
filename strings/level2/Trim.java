package level2;

import java.util.Scanner;

public class Trim {
    static int[] findStartEnd(String s) {
        int start = 0, end = 0;
        try { while (s.charAt(start) == ' ') start++; } catch (Exception e) {}
        try {
            while (true) { s.charAt(end); end++; }
        } catch (Exception e) { end--; while (s.charAt(end) == ' ') end--; }
        return new int[]{start, end};
    }

    static String subString(String s, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) res += s.charAt(i);
        return res;
    }

    static boolean compare(String a, String b) {
        try {
            int i = 0;
            while (a.charAt(i) == b.charAt(i)) i++;
            return false;
        } catch (Exception e) {
            try { a.charAt(b.length()); return false; } catch (Exception ex) {}
            try { b.charAt(a.length()); return false; } catch (Exception ex) {}
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] pos = findStartEnd(input);
        String trimmed = subString(input, pos[0], pos[1]);
        String builtIn = input.trim();
        boolean result = compare(trimmed, builtIn);
        System.out.println("Match: " + result);
    }
}
