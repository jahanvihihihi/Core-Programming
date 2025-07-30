import java.util.Scanner;

public class FactorAnalysis {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\n" + findSum(factors));
        System.out.println(findProduct(factors));
        System.out.println(findSumOfSquares(factors));
    }
}
