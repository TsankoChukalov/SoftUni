package ExercisesExams;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumRent = Double.parseDouble(scanner.nextLine());

        double sumCake = sumRent * 0.20;
        double sumDrink = sumCake - sumCake * 0.45;
        double sumAnimator = sumRent / 3;

        double budgetNeeded = sumRent + sumCake + sumDrink + sumAnimator;

        System.out.println(budgetNeeded);

    }
}
