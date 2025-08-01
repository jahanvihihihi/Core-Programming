import java.util.Scanner;

public class compare {
    static String makeSubstring(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) sub += s.charAt(i);
        return sub;
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
        String text = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String sub1 = makeSubstring(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("charAt() substring: " + sub1);
        System.out.println("built-in substring: " + sub2);
        System.out.println(compare(sub1, sub2) ? "Substrings match" : "Substrings don't match");
    }
}
