package ExamExercises;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int allMinutes = num * min;
        int allCalories = allMinutes * 5;
        double percentCalories = calories * 0.50;

        if (allCalories >= percentCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", allCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", allCalories);
        }
    }
}
