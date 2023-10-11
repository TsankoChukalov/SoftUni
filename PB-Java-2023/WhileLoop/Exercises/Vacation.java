package WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int allDays = 0;
        int spendDays = 0;

        while (availableMoney < vacationCost && spendDays < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            allDays++;

            if (action.equals("spend")) {
                availableMoney = availableMoney - money;
                spendDays++;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            } else if (action.equals("save")) {
                availableMoney = availableMoney + money;
                spendDays = 0;
            }
        }
        if (availableMoney >= vacationCost) {
            System.out.printf("You saved the money for %d days.", allDays);
        }
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }

    }
}
