package level2;

import java.util.Scanner;

public class SplitWords {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitManual(String s) {
        int len = getLength(s);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') spaceCount++;
        }

        int[] spaceIndex = new int[spaceCount + 2];
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') spaceIndex[idx++] = i;
        }
        spaceIndex[0] = -1;
        spaceIndex[idx] = len;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += s.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] manual = splitManual(text);
        String[] builtin = text.split(" ");

        System.out.println(compareArrays(manual, builtin) ? "Words match" : "Words do not match");
    }
}
