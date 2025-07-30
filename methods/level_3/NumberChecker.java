import java.util.*;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuckNumber(int[] arr) {
        for (int i = 1; i < arr.length; i++) if (arr[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] arr) {
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, arr.length);
        return sum == num;
    }

    public static int[] findLargestTwo(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > max) { second = max; max = d; }
            else if (d > second && d != max) second = d;
        }
        return new int[]{max, second};
    }

    public static int[] findSmallestTwo(int[] arr) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < min) { second = min; min = d; }
            else if (d < second && d != min) second = d;
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = countDigits(num);
        int[] digits = getDigitsArray(num);
        System.out.println("Digits count: " + count);
        System.out.println("Duck number: " + isDuckNumber(digits));
        System.out.println("Armstrong: " + isArmstrong(num, digits));
        int[] large = findLargestTwo(digits);
        System.out.println("Largest: " + large[0] + ", Second Largest: " + large[1]);
        int[] small = findSmallestTwo(digits);
        System.out.println("Smallest: " + small[0] + ", Second Smallest: " + small[1]);
    }
}
