package level2;

import java.util.Scanner;

public class WordLength {
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

    static String[] splitWords(String s) {
        int len = getLength(s), count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') count++;
        }

        int[] spaceIndex = new int[count + 2];
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') spaceIndex[idx++] = i;
        }
        spaceIndex[0] = -1;
        spaceIndex[idx] = len;

        String[] words = new String[count + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += s.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordWithLengths(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
