package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu =Integer.parseInt(scanner.nextLine());

        double priceChicken = chickenMenu * 10.35;
        double priceFish = fishMenu * 12.4;
        double priceVegan = veganMenu * 8.15;

        double priceAllMenu =priceChicken + priceFish + priceVegan;
        double priceDesert = priceAllMenu * 0.20;
        double totalPrice = priceAllMenu + priceDesert + 2.50;

        System.out.println(totalPrice);

    }
}
