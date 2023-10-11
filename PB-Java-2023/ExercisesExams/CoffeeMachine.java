package ExercisesExams;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double espressoPrice = 0;
        double cappuccinoPrice = 0;
        double teaPrice = 0;
        double totalPrice = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    espressoPrice = quantity * 0.90;
                    espressoPrice = espressoPrice * 0.65;
                } else if (sugar.equals("Extra")) {
                    espressoPrice = quantity * 1.20;
                } else {
                    espressoPrice = quantity * 1.0;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    cappuccinoPrice = quantity * 1.0;
                    cappuccinoPrice = cappuccinoPrice * 0.65;
                } else if (sugar.equals("Extra")) {
                    cappuccinoPrice = quantity * 1.60;
                } else {
                    cappuccinoPrice = quantity * 1.20;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    teaPrice = quantity * 0.50;
                    teaPrice = teaPrice * 0.65;
                } else if (sugar.equals("Extra")) {
                    teaPrice = quantity * 0.70;
                } else {
                    teaPrice = quantity * 0.60;
                }
                break;
        }
        if (drink.equals("Espresso") && quantity >= 5) {
            espressoPrice = espressoPrice * 0.75;
        }
        totalPrice = espressoPrice + cappuccinoPrice + teaPrice;

        if (totalPrice > 15) {
            totalPrice = totalPrice * 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", quantity, drink, totalPrice);


    }
}
