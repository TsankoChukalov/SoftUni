package ExercisesExams;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int countWin = 0;
        int countLost = 0;
        double allMoney = 0;
        double moneyForDay = 0;
        int win = 0;
        int lost = 0;

        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String winOrLose = scanner.nextLine();

                if (winOrLose.equals("win")) {
                    moneyForDay += 20;
                    countWin++;
                } else {
                    countLost++;
                }


                input = scanner.nextLine();
            }
            if (countWin > countLost) {
                moneyForDay *= 1.1;
                win++;
            } else {
                lost++;
            }
            allMoney += moneyForDay;
            moneyForDay = 0;
            countWin = 0;
            countLost = 0;

        }
        if (win > lost) {
            allMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", allMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allMoney);
        }


    }
}
