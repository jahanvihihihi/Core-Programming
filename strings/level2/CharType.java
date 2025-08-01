package level2;

import java.util.Scanner;

public class CharType {
    static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);  
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeCharacters(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len); 
                len++;
            }
        } catch (Exception e) {
        }

        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    static void displayCharacterAnalysis(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] analysis = analyzeCharacters(input);
        displayCharacterAnalysis(analysis);
    }
}
