import java.util.Scanner;

public class UpperClassDemo {
    static String toUpperManual(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            result += ch;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String manual = toUpperManual(input);
        String builtin = input.toUpperCase();
        System.out.println(compare(manual, builtin) ? "Match" : "Do not match");
    }
}
