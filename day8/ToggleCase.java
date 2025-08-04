import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), res = "";
        for (char c : str.toCharArray())
            res += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        System.out.println("Toggled: " + res);
    }
}
