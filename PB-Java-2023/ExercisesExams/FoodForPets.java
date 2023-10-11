package ExercisesExams;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodCount = Double.parseDouble(scanner.nextLine());

        double biscuits = 0;
        double eatenFoodDog = 0;
        double eatenFoodCat = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            eatenFoodDog = eatenFoodDog + dogFood;
            eatenFoodCat = eatenFoodCat + catFood;

            if (i % 3 == 0) {
                double currentBiscuits = Math.round (dogFood + catFood) * 0.1;
                biscuits += currentBiscuits ;
            }
        }
        double allEatenFood = eatenFoodDog + eatenFoodCat;
        double percentFood = (allEatenFood / foodCount) * 100;
        double percentDog = (eatenFoodDog / allEatenFood) * 100;
        double percentCat = (eatenFoodCat / allEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentFood);
        System.out.printf("%.2f%% eaten from the dog.%n",percentDog);
        System.out.printf("%.2f%% eaten from the cat.",percentCat);

    }
}
