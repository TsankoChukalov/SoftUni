package ExamExercises;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        double racketTotalPrice = racketPrice * n;
        double sneakersPrice = racketPrice / 6;
        double sneakersTotalPrice = sneakersPrice * m;
        double totalPrice = racketTotalPrice + sneakersTotalPrice;
        double additionalEquipment = totalPrice * 0.20;
        double finalPrice = totalPrice + additionalEquipment;
        double djokovicPrice = finalPrice / 8;
        double sponsorPrice = finalPrice - djokovicPrice;

        System.out.printf("Price to be paid by Djokovic %.0f\n",Math.floor(djokovicPrice) );
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(sponsorPrice));

    }
}
