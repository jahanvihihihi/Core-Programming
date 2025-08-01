import java.util.Scanner;

public class StringIndexDEmo {
    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // causes exception
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        handleException(input);
    }
}
