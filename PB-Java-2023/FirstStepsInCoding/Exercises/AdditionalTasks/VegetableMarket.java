package FirstStepsInCoding.Exercises.AdditionalTasks;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablePrice =Double.parseDouble(scanner.nextLine());
        double fruitPrice =Double.parseDouble(scanner.nextLine());
        int vegetableKg =Integer.parseInt(scanner.nextLine());
        int fruitKg =Integer.parseInt(scanner.nextLine());

        double vegetable = vegetablePrice * vegetableKg;
        double fruit = fruitPrice * fruitKg;

        double totalPrice =(vegetable + fruit) / 1.94;
         System.out.printf("%.2f", totalPrice);

    }
}
