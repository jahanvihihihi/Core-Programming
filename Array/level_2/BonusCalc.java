import java.util.*;

public class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, y, b, totalB = 0, totalOld = 0, totalNew = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Emp " + i + " Salary & Years: ");
            s = sc.nextDouble(); y = sc.nextDouble();
            if (s <= 0 || y < 0) { System.out.println("Invalid!"); i--; continue; }
            b = s * (y > 5 ? 0.05 : 0.02);
            totalB += b; totalOld += s; totalNew += (s + b);
            System.out.printf("Bonus: ₹%.2f, New Salary: ₹%.2f\n", b, s + b);
        }

        System.out.printf("\nTotal Old: ₹%.2f\nTotal Bonus: ₹%.2f\nTotal New: ₹%.2f\n",
                          totalOld, totalB, totalNew);
    }
}
