import java.util.*;

public class PalindromeCheck {
    static boolean isPalindromeIter(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    static boolean isPalindromeRec(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRec(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Iterative: " + isPalindromeIter(s));
        System.out.println("Recursive: " + isPalindromeRec(s, 0, s.length() - 1));
    }
}
