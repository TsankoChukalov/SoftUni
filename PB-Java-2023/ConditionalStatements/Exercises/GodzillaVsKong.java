package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double allPriceClothes = clothesPrice * statists;

        if (statists > 150) {
            allPriceClothes = allPriceClothes - (allPriceClothes * 0.10);
        }

        double totalSum = decor + allPriceClothes;
        double leftMoney = Math.abs(budget - totalSum);

        if (totalSum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", leftMoney);
        }


    }
}
