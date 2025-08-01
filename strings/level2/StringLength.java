package level2;

import java.util.Scanner;

public class StringLength {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int manualLength = getLength(text);
        int builtinLength = text.length();
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtinLength);
    }
}
