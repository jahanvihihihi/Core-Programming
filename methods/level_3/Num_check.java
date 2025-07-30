package level_3;

import java.util.Arrays;
import java.util.Scanner;

public class Num_check {
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[idx++] = i;

        return factors;
    }

    public static int getGreatestFactor(int[] arr) {
        int max = arr[0];
        for (int i : arr)
            if (i > max) max = i;
        return max;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static int getProduct(int[] arr) {
        int prod = 1;
        for (int i : arr) prod *= i;
        return prod;
    }

    public static double getProductOfCubes(int[] arr) {
        double prod = 1;
        for (int i : arr)
            prod *= Math.pow(i, 3);
        return prod;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0) sum += i;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0) sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0) sum += i;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSum(factors));
        System.out.println("Product of Factors: " + getProduct(factors));
        System.out.println("Product of Cubes of Factors: " + getProductOfCubes(factors));
        System.out.println("Is Perfect: " + isPerfect(num));
        System.out.println("Is Abundant: " + isAbundant(num));
        System.out.println("Is Deficient: " + isDeficient(num));
        System.out.println("Is Strong: " + isStrong(num));
    }
}
