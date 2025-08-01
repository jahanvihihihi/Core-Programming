import java.util.*;
public class Main{
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        boolean res1 = compare(s1, s2);
        boolean res2 = s1.equals(s2);
        System.out.println("charAt(): " + res1);
        System.out.println("equals(): " + res2);
        System.out.println(res1 == res2 ? "Same result" : "Different result");
    }
}