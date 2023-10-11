package ExercisesExams;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double priceForCard = 0;
        char gender = input.charAt(0);

        switch (sport) {
            case "Gym":
                if (gender ==('m')) {
                    priceForCard = 42;
                } else {
                    priceForCard = 35;
                }
                break;
            case "Boxing":
                if (gender == ('m')) {
                    priceForCard = 41;
                } else {
                    priceForCard = 37;
                }
                break;
            case "Yoga":
                if (gender == ('m')) {
                    priceForCard = 45;
                } else {
                    priceForCard = 42;
                }
                break;
            case "Zumba":
                if (gender == ('m')) {
                    priceForCard = 34;
                } else {
                    priceForCard = 31;
                }
                break;
            case "Dances":
                if (gender == ('m')) {
                    priceForCard = 51;
                } else {
                    priceForCard = 53;
                }
                break;
            case "Pilates":
                if (gender == ('m')) {
                    priceForCard = 39;
                } else {
                    priceForCard = 37;
                }
                break;
        }
        if (age <= 19) {
            priceForCard = priceForCard * 0.80;
        }
        double diff = Math.abs(sum - priceForCard);
        if (priceForCard <= sum) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
        }

    }
}
