package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());

        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions =Integer.parseInt(scanner.nextLine());
        int trucks =Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzle * 2.6;
        double dollsPrice = dolls * 3;
        double bearPrice = bears * 4.10;
        double minionsPrice = minions * 8.2;
        double trucksPrice = trucks * 2;

        double profit = puzzlePrice + dollsPrice + bearPrice + minionsPrice + trucksPrice;
        int numberOfToys = puzzle + dolls + bears + minions + trucks;

        if (numberOfToys >= 50) {
            profit = profit - (profit * 0.25);
        }
        double totalProfit = profit - (profit * 0.10);

        double difference =Math.abs(totalProfit - holidayPrice);

        if (totalProfit >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", difference);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }


    }
}
