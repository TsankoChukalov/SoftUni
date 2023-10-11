package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String valuation = scanner.nextLine();

        double totalPrice = 0.0;

        switch (roomType) {
            case "room for one person":
                totalPrice = (daysStay - 1) * 18;
                break;
            case "apartment":
                totalPrice = (daysStay - 1) * 25;

                if (daysStay < 10) {
                    totalPrice *= 0.70;
                } else if (daysStay > 10 && daysStay < 15) {
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.50;
                }
                break;
            case "president apartment":
                totalPrice = (daysStay - 1) * 35;

                if (daysStay < 10) {
                    totalPrice *= 0.90;
                } else if (daysStay > 10 && daysStay < 15) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.80;
                }
                break;
        }
        if (valuation.equals("positive")) {
            totalPrice *= 1.25;
        } else {
            totalPrice *= 0.9;
        }
        System.out.printf("%.2f", totalPrice);


    }
}
