package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litersPrep = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double priceBeforeDiscount = pens * 5.80 + markers * 7.20 + litersPrep * 1.20;
        double finalPrice = priceBeforeDiscount - priceBeforeDiscount *percentDiscount / 100;

        System.out.println(finalPrice);

    }
}
