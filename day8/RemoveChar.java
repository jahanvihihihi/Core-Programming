import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String res = "";
        for (char c : str.toCharArray())
            if (c != ch) res += c;
        System.out.println("Modified String: " + res);
    }
}
