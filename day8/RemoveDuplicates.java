import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), res = "";
        for (char c : str.toCharArray())
            if (res.indexOf(c) == -1) res += c;
        System.out.println("Modified: " + res);
    }
}
