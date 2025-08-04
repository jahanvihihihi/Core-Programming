import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int len = Math.min(s1.length(), s2.length()), i = 0;
        while (i < len && s1.charAt(i) == s2.charAt(i)) i++;
        if (i == len)
            System.out.println(s1.length() == s2.length() ? "Both strings are equal" : (s1.length() < s2.length() ? s1 + " comes before " + s2 : s2 + " comes before " + s1));
        else
            System.out.println(s1.charAt(i) < s2.charAt(i) ? s1 + " comes before " + s2 : s2 + " comes before " + s1);
    }
}
