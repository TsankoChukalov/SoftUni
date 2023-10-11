package ExercisesExams;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceUpTo20Kg = Double.parseDouble(scanner.nextLine());
        double baggageKg = Double.parseDouble(scanner.nextLine());
        int daysToTraveling = Integer.parseInt(scanner.nextLine());
        int numOfBags = Integer.parseInt(scanner.nextLine());
        double tax = 0;

        if (baggageKg < 10) {
            tax = priceUpTo20Kg / 5;
        } else if (baggageKg <= 20) {
            tax = priceUpTo20Kg / 2;
        } else {
            tax = priceUpTo20Kg;
        }
        if (daysToTraveling < 7) {
            tax += tax * 0.40;
        } else if (daysToTraveling <= 30) {
            tax += tax * 0.15;
        } else {
            tax += tax * 0.10;
        }
        double totalSum = tax * numOfBags;

        System.out.printf(" The total price of bags is: %.2f lv. ", totalSum);


    }
}
