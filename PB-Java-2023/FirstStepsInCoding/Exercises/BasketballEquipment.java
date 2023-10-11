package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax =Double.parseDouble(scanner.nextLine());

        double sneakersPrice = tax - tax * 0.40;
        double outfitPrice = sneakersPrice - sneakersPrice * 0.20;
        double ballPrice = outfitPrice / 4;
        double accessoriesPrise = ballPrice /5;

        double totalPrice = tax + sneakersPrice + outfitPrice + ballPrice + accessoriesPrise;

        System.out.println(totalPrice);




    }
}
