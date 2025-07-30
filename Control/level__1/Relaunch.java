package level__1;

import java.util.Scanner;

public class Relaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number for countdown: ");
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("🚀 Rocket Launched!");
    }
}
