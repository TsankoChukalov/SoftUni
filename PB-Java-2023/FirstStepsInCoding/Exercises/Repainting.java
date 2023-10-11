package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceForNylon = (nylon + 2) * 1.50;
        double priceForPaint = (paint + paint * 0.10 ) * 14.50;
        double priceForThinner = thinner * 5.00;

        double priceForMaterials = priceForNylon + priceForPaint + priceForThinner + 0.40;
        double priceForMasters = (priceForMaterials * 0.30) * hours;

        double totalPrice = priceForMaterials + priceForMasters;

        System.out.println(totalPrice);

    }
}
