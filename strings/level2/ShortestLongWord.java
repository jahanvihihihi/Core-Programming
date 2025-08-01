package level2;

import java.util.Scanner;

public class ShortestLongWord {
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
        int len = getLength(s), spaceCount = 0;
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

    static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    static int[] findShortestLongest(String[][] wordData) {
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(wordData[0][1]);
        int maxLen = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] data = wordWithLengths(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest word: " + data[result[0]][0]);
        System.out.println("Longest word: " + data[result[1]][0]);
    }
}
