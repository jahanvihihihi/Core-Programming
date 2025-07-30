package level_3;

public class EmployeeBonus {
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; 
        for (int i = 0; i < employees; i++) {
            int salary = 10000 + (int)(Math.random() * 90000);
            int years = 1 + (int)(Math.random() * 10); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2]; 
        for (int i = 0; i < data.length; i++) {
            double bonusPercent = (data[i][1] > 5) ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusPercent;
            double newSalary = data[i][0] + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displayTable(int[][] original, double[][] updated) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        System.out.printf("%-5s %-12s %-12s %-10s %-12s\n", "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < original.length; i++) {
            int oldSalary = original[i][0];
            int years = original[i][1];
            double bonus = updated[i][0];
            double newSalary = updated[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-12d %-12d %-10.2f %-12.2f\n", (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total   %-12.2f %-12s %-10.2f %-12.2f\n", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayTable(employeeData, bonusData);
    }
}
