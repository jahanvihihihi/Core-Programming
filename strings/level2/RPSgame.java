package level2;

import java.util.Arrays;
import java.util.Scanner;

public class RPSgame {
    static String getCompChoice() {
        int n = (int)(Math.random() * 3);
        return n == 0 ? "rock" : n == 1 ? "paper" : "scissors";
    }

    static String getWinner(String u, String c) {
        if (u.equals(c)) return "draw";
        if ((u.equals("rock") && c.equals("scissors")) || (u.equals("paper") && c.equals("rock")) || (u.equals("scissors") && c.equals("paper"))) return "user";
        return "comp";
    }

    static String[][] play(int n) {
        Scanner sc = new Scanner(System.in);
        String[][] res = new String[n + 2][4];
        int uc = 0, cc = 0;
        for (int i = 0; i < n; i++) {
            String user = sc.next().toLowerCase();
            String comp = getCompChoice();
            String win = getWinner(user, comp);
            if (win.equals("user")) uc++;
            if (win.equals("comp")) cc++;
            res[i][0] = String.valueOf(i + 1);
            res[i][1] = user;
            res[i][2] = comp;
            res[i][3] = win;
        }
        res[n][0] = "Total Wins";
        res[n][1] = String.valueOf(uc);
        res[n][2] = String.valueOf(cc);
        res[n + 1][0] = "Win %";
        res[n + 1][1] = String.format("%.2f", uc * 100.0 / n);
        res[n + 1][2] = String.format("%.2f", cc * 100.0 / n);
        return res;
    }

    static void display(String[][] a) {
        for (String[] r : a) System.out.println(Arrays.toString(r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(play(n));
    }
}
