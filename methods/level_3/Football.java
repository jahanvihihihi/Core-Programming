package level_3;

public class Football {
    public static int[] generateHeights(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 150 + (int)(Math.random() * 101);
        return arr;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        for (int h : heights) System.out.println(h);
        System.out.println("Mean: " + findMean(heights));
        System.out.println("Shortest: " + findMin(heights));
        System.out.println("Tallest: " + findMax(heights));
    }
}
