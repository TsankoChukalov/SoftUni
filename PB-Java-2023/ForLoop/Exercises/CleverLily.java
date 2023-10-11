package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());

        int brother = 0;
        double money = 0;
        double allMoney = 0;
        int toysCount = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                money += 10;
                allMoney += money;
                brother++;
            } else {
                toysCount++;
            }
        }
        double toysSum = toysPrice * toysCount - brother;
        double totalMoney = allMoney + toysSum;

        double diff = Math.abs(washMachinePrice - totalMoney);

        if (totalMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
