package ExercisesExams;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfNights = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        if (numberOfNights > 7) {
            price = price * 0.95;
        }
        percent = percent / 100;

        double allNightsPrice = price * numberOfNights;
        double additionalCosts = budget * percent;
        double totalPrice = allNightsPrice + additionalCosts;

        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", moneyLeft);
        } else {
            System.out.printf("%.2f leva needed.", moneyLeft);
        }
    }
}
