package Exam_2;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paint = Integer.parseInt(scanner.nextLine());
        int wallpapers = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double allPricePaint = paint * 21.50;
        double allPriceWallpapers = wallpapers * 5.20;
        double glovesNeeded = Math.ceil(wallpapers * 0.35);
        double brushNeeded = Math.floor(paint * 0.48);
        double allGlovesPrice = glovesNeeded * glovesPrice;
        double allBrushPrice = brushNeeded * brushPrice;

        double totalPrice = allPricePaint + allPriceWallpapers + allGlovesPrice + allBrushPrice;
        double deliveryPrice = totalPrice / 15;

        System.out.printf("This delivery will cost %.2f lv.", deliveryPrice);

    }
}
