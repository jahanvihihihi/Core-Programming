import java.util.Scanner;

public class ArrayIndex {
    static void generateException(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        handleException(names);
    }
}
