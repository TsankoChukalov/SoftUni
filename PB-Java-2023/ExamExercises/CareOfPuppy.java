package ExamExercises;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int foodGr = foodKg * 1000;
        int allFood = 0;

        while (!command.equals("Adopted")) {
            int foodEaten = Integer.parseInt(command);

            allFood += foodEaten;


            command = scanner.nextLine();
        }
        int leftoverFood = Math.abs(foodGr - allFood);

        if (allFood <= foodGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", leftoverFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", leftoverFood);
        }

    }
}
