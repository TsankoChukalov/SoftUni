package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherMan = Integer.parseInt(scanner.nextLine());

        double totalprice = 0.0;

        switch (season) {
            case "Spring":
                totalprice = 3000;
                break;
            case "Summer":
                totalprice = 4200;
                break;
            case "Autumn":
                totalprice = 4200;
                break;
            case "Winter":
                totalprice = 2600;
                break;
        }
        if (fisherMan <= 6) {
            totalprice = totalprice * 0.90;
        } else if (fisherMan > 7 && fisherMan <= 11) {
            totalprice = totalprice * 0.85;
        } else if (fisherMan > 12) {
            totalprice = totalprice * 0.75;
        }
        if (fisherMan % 2 == 0 && !season.equals("Autumn")) {
            totalprice = totalprice * 0.95;
        }
        double diff = Math.abs(budget - totalprice);

        if (budget >= totalprice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
