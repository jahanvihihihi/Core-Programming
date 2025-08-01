import java.util.Scanner;

public class NumFormat {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        handleException(input);
    }
}
