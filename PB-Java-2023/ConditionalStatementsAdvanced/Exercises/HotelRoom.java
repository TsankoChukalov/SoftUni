package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numOFNight = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;


        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (numOFNight > 7 && numOFNight < 14) {
                    studioPrice *= 0.95;
                } else if (numOFNight > 14) {
                    studioPrice *= 0.70;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.2;
                apartmentPrice = 68.70;

                if (numOFNight > 14) {
                    studioPrice *= 0.80;
                }

                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;

                break;
        }
        if (numOFNight > 14) {
            apartmentPrice *= 0.90;
        }
        double totalPriceApartament = apartmentPrice * numOFNight;
        double totalPriceStudio = studioPrice * numOFNight;

                System.out.printf("Apartment: %.2f lv.%n", totalPriceApartament);
                System.out.printf("Studio: %.2f lv.", totalPriceStudio);

    }
}
