package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard =Integer.parseInt(scanner.nextLine());
        int processors =Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrise =videoCard * 250;
        double processorPrice = videoCardPrise * 0.35 * processors;
        double ramPrice = videoCardPrise * 0.10 * ram;

        double totalSum = videoCardPrise + processorPrice + ramPrice;

        if (videoCard > processors) {
            totalSum = totalSum - totalSum * 0.15;
        }

        double diff = Math.abs(totalSum - budget);
        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
